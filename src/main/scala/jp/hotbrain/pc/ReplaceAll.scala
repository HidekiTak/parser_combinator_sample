package jp.hotbrain.pc

/**
  *
  */
case class ReplaceAll(body: String) extends BodyExecuter {

  def process(map: Map[String, String]): String = {
    map.foldLeft(body) {
      (body, kvp) => body.replaceAllLiterally(kvp._1, kvp._2)
    }
  }
}


object ReplaceAll extends BodyFactory{
  def prepare(body: String): BodyExecuter = {
    ReplaceAll(body)
  }
}
