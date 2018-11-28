package recursion

import scala.annotation.tailrec

class TailRecursion {

  // factorial calculating
  // ! tail recursion can be only private or final

    @tailrec
    final def factorialTailAccum(number: Int, accum: Int): Int = {
      var newAccum = accum
      if (number <= 1) {
        accum
      }
      newAccum = accum * number
      factorialTailAccum(number - 1, newAccum)
  }

}
