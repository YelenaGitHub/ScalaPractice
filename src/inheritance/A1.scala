package inheritance

trait A1 {
  val foo: Int
  val bar = 10
  println("In A1: foo: " + foo + "; bar: " + bar)
}

class B1 extends A1{
  val foo: Int = 25
  println("In B1: foo: " + foo + "; bar: " + bar)
}

class C1 extends B1{
  override val bar = 99
  println("In C1: foo: " + foo + "; bar: " + bar)
}