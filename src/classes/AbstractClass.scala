package classes

abstract class AbstractClass {

  val l = List(1, 2, 3)

  def contents: Array[String]

  def contents2: Array[String] = {
    Array("1", "2")
  }

}
