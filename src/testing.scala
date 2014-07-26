import chap6._
import chap5._

/**
 * @author volhovm
 *         Created on 7/4/14
 */

object testing extends App{
//  val a = Point(2, 3)
//  print(a)
  println(CardSuit.values.toList.map(CardSuit.isRed))
  println(RGBCube.values.toList.map((a) => "%06x: %s".format(a.id, a)))
}
