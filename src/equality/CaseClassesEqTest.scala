package equality

trait SpyOnEquals {
  override def equals(x: Any) = {
    println("DEBUG: In equals")
    super.equals(x)
  }

}

case class CC()
case class CCSpy() extends SpyOnEquals

class CaseClassesEqTest {
  val cc1 = new CC() with SpyOnEquals
  val cc2 = new CC() with SpyOnEquals

  println("cc1 == cc2: " + (cc1 == cc2))
  println(cc1 == cc2)
  println("cc1.## == cc2.##: ")
  println(cc1.## == cc2.##)
}
