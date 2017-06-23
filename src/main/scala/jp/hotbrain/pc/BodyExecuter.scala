package jp.hotbrain.pc

trait BodyExecuter {
  def process(map: Map[String, String]): String
}

trait BodyFactory {
  def prepare(body: String): BodyExecuter

}
