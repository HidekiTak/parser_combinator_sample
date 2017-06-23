package jp.hotbrain.pc

import scala.util.parsing.combinator.RegexParsers

// ---------------------------------------------------------------------------------------------------------------------
//
//   本文構成要素
//
//

trait BodyString {
  def process(sb: StringBuilder, params: Map[String, String]): StringBuilder
}

case class RawString(str: String) extends BodyString {
  override def process(sb: StringBuilder, params: Map[String, String]): StringBuilder = sb.append(str)
}


case class ParamString(key: String) extends BodyString {
  override def process(sb: StringBuilder, params: Map[String, String]): StringBuilder = sb.append(params.getOrElse(key, ""))
}

// ---------------------------------------------------------------------------------------------------------------------
//
//   実行部本体
//
//

case class ParserCombinator(body: Seq[BodyString]) extends BodyExecuter {

  /**
    * スレッドごとに１つ、StringBuilderがあれば使いまわせる。
    */
  private[this] final val sb: ThreadLocal[StringBuilder] = new ThreadLocal[StringBuilder] {
    override protected def initialValue(): StringBuilder = {
      new StringBuilder
    }
  }

  def process(map: Map[String, String]): String = {
    body.foldLeft(
      {
        val s = sb.get
        s.clear()
        s
      }
    )(
      (sb, bodyString) => bodyString.process(sb, map)).toString()
  }
}

object ParserCombinator extends BodyFactory {
  override def prepare(body: String): BodyExecuter = {
    ParserCombinator(new BodyParser().apply(body))
  }
}

// ---------------------------------------------------------------------------------------------------------------------
//
//   パーサー
//
//

class BodyParser extends RegexParsers {

  override def skipWhitespace = false

  private[this] final val escChar = "\\\\(.)".r

  private[this] final val rawString: Parser[RawString] = "(?ms)(?:\\\\.|[^~\\\\]+)+".r ^^ { x =>
    try {
      if (x.indexOf('\\') < 0) {
        RawString(x)
      } else {
        RawString(escChar.replaceAllIn(x, _.group(1)))
      }
    } catch {
      case ex: Throwable =>
        ex.printStackTrace()
        throw ex
    }
  }

  private[this] final val paramString: Parser[ParamString] = "~ [0-9a-zA-Z_]+ ~".r ^^ { x =>
    ParamString(x)
  }

  private[this] final val all: Parser[Seq[BodyString]] = rep(paramString | rawString)

  def apply(body: String): Seq[BodyString] = {
    parseAll(all, body).get
  }
}
