package inheritance

trait A {
  val audience: String
  println("Hello " + audience)
}

class BMember(a: String = "BMember") extends A{
  val audience = a
  println("I repeat: Hello " + audience)
}

class BConstructor(val audience: String = "BConstructor") extends A{
  println("I repeat: Hello " + audience)
}

// Expectation
/*
    new BMember()
    new BConstructor()

Hello: null
I repeat: Hello BMember
Hello: null // <- error here Hello: BConstructor
I repeat: Hello BConstructor

 */

