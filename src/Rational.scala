class Rational (n: Int, d: Int) {

  require(d != 0)

  val number: Int = n
  val denom: Int = d


  def + (that: Rational): Rational = {
    new Rational(number * that.number + that.number * denom, denom * that.denom)
  }

  def * (i: Int): Rational ={
    new Rational(number * i, denom)
  }

  def this(n: Int, d:String) = this(n, 2)

  def this(n:Int) = this(n, "1")

}
