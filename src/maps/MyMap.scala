package maps

class MyMap {

  def func()= {
    val xs = Seq(
              Seq("a","b","c"),
              Seq("d","e","f"),
              Seq("g","h"),
              Seq("i","j","k")
    )

    val ys = for
      (Seq(x, y, z) <- xs)
      yield x + y + z // тип возвращаемой коллекции в yield совпадает с коллекцией по которой итерируемся


    val l = Seq(1, 2, 50)
    val filteredList = l.withFilter(i => i > 10)
    println("Filtered list: ")
    filteredList.foreach(println)

    val zs = xs map {
      case Seq(x, y, z) => x + y + z
    }
  }

}
