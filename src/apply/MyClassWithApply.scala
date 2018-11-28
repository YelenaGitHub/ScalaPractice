package apply

class MyClassWithApply private (
  private val i: Int,
  private val j: Int
) {
}
// Фабричный метод, вызывается как MyClassWithApply или MyClassWithApply.apply()
object MyClassWithApply {
  def apply() = List(1,2,3)
  println("MyClassWithApply from apply")
}

