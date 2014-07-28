import chap6._
import chap5._
import chap7._
import chap8._

/**
 * @author volhovm
 *         Created on 7/4/14
 */

object Testing extends App{
  println(new Time(12,30).before(new Time(23,40)))

  println(Point(2,3))
  println(CardSuit.values.toList.map(CardSuit.isRed))
  println(RGBCube.values.toList.map((a) => "%06x: %s".format(a.id, a)))

  random.setSeed(System.currentTimeMillis.toInt)
  println(for (i <- 0 to 10) yield random.nextDouble)
  Ex09

  implicit def nTimes(n: Int) = new {
    def times(foo: => Unit) = 1 to n foreach {_ => foo}
  }
  val acc = new SavingAccount
  7 times println(acc.deposit(200))

}
