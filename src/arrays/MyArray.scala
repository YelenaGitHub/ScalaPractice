package arrays

class MyArray {

  def square[T: Numeric](n: T) = implicitly[Numeric[T]].times(n, n)

  def twiceA[T](f: T => T, a: T) = f(f(a))
  def twiceD[T](a: T)(f: T => T) = f(f(a))

}
