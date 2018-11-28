import java.io.{File, PrintWriter}

import arrays.MyArray
import equality.CaseClassesEqTest
import recursion.TailRecursion

object Main {

  def main(args: Array[String]): Unit = {

    // arrays
    val arr: MyArray = new MyArray
    val tailRecursion = new TailRecursion
    val res1 = tailRecursion.factorialTail(2, 1)
    println("res1: " + res1)

    //arr.square[Int](10)
    //println("arr.square[type](10): " + arr.square[Double](10))
    //val twiceAResult = arr.twiceA(arr.square, 2)
    //println("twiceA: " + twiceAResult)

    //val twiceDResult = arr.twiceD(2)(arr.square)
    //println("twiceD: " + twiceDResult)

    // Closure
    /*val closure: MyClosure = new MyClosure
    val closureResult = closure.devider(10)
    println("Closure: " + closureResult)
    */

    // Map comprehension
    //val map: MyMap = new MyMap
    //map.func()

     // case classes equalities:
    val caseClass = new CaseClassesEqTest
/*
    val str = new Array[String](3);
    str(0) = "0";
    str(1) = "1";
    str(2) = "2";

    for (i <- 0 to 2){
      print(str(i))
    }

    val s1 = "1"
    val s2 = "1"

    val b = (s1 == s2)
    print("s1 == s2: " + b)

    val x = new Rational(2,3)
    println("\nx * 2 is " + (x * 2))

    //implicit def intToRational(x: Int) = new Rational(x)
    // 2.*(x)

    val t = for {
      s <- str
      //if s.endsWith("1")
    } yield s

    val l = List("1", "2", "3")
    val b1 =  l.exists(_.contains("1"))
    println("Is list contains 1: " + b1)

    println("yield result is " + t)
    for (t1 <- t) {
      println(t1)
    }

    withPrintWriter(
      new File("date.txt"),
      writer => writer.println(new java.util.Date)
    )

    // избавились от формы записи через () => 5 > 3
    byNameAssert(5 > 3)

    val s3 = str mkString "***"
    println("s3: " + s3)

    // списки неизменяемые
    val l4 = List(1,2,3)
    println("\n list value: " + l4(0))

    val bufList = new ListBuffer[Int]
    bufList += 2; // += добавление элемента в конец списка
    bufList += 3; // += добавление элемента в конец списка
    1 +=: bufList // +=: добавление элемента в начало списка
    println("bufList: " + bufList.toList)

    val bufArray = new ArrayBuffer[Int]()
    bufArray += 3 // += добавление элемента в конец
    1 +=: bufArray // +=: добавление элемента в начало
    println("bufArray: " + bufArray.toList)

    println("cortage: " + getCortage())
    // check execute apply
    MyClassWithApply()
*/

  }

  private def filesHere = new java.io.File(".").listFiles()

  //
  def fileMatching(query: String, matcher: (String, String) => Boolean): Unit ={
    for (file <- filesHere; if matcher(file.getName, query))
      yield file.getName;
  }

  def filesEnding(query: String): Unit = {
    fileMatching(query, _.endsWith(_))
    // _.endsWith(_) - синтаксис заместителя
    // тоже самое, что и краткая форма выше
    fileMatching(query, (fileName: String, query: String) => fileName.endsWith(query))
  }

  def withPrintWriter(file: File, op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try{
      op(writer)
    } finally {
      writer.close()
    }
  }

  // параметры до востребования
  def byNameAssert(predicate: => Boolean): Unit = {
    var assertionEnabled = false
    if (assertionEnabled && !predicate)
      throw new AssertionError()
  }

  def error(message: String): Nothing =
    throw new RuntimeException(message)

  sealed abstract class Expr
  case class Var(name: String) extends Expr
  case class Number(num: Double) extends Expr
  //
  def describe(e: Expr): Unit =
  e match {
    case Number(_) => "a number"
    case Var(_) => "a vairable"
    case _ => throw new RuntimeException // Не должно произойти
  }
  // Укороченная запись
  def describe2(e:Expr): String = (e: @unchecked)
    match {
    case Number(_) => "a number"
    case Var(_) => "a variable"
  }

  def getCortage() = {
    val i = 0
    val s = "string"
    (i, s)
  }

}
