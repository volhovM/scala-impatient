import chap6._
import chap5._
import chap7._

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
}
