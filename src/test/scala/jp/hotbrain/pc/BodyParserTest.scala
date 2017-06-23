package jp.hotbrain.pc

import org.junit.Test
import org.junit.Assert._

/**
  * Created by htakada on 2017/06/23.
  */
class BodyParserTest {

  @Test
  def parseTest(): Unit = {
    val parser = new BodyParser

    assertEquals(Seq(), parser.apply(""))
    assertEquals(Seq(RawString("123")), parser.apply("123"))
    assertEquals(Seq(RawString("123 "), ParamString("~ 456 ~")), parser.apply("123 ~ 456 ~"))
    assertEquals(Seq(ParamString("~ 456 ~"), RawString(" 123")), parser.apply("~ 456 ~ 123"))
    assertEquals(Seq(RawString("123 "), ParamString("~ 456 ~"), RawString(" 123")), parser.apply("123 ~ 456 ~ 123"))
    assertEquals(Seq(RawString("1~3 "), ParamString("~ 456 ~"), RawString(" 123")), parser.apply("1\\~\\3 ~ 456 ~ 123"))
  }
}
