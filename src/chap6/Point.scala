package chap6

/**
 * @author volhovm
 *         Created on 7/4/14
 */

class Point (x : Int = -1, y : Int = -1) extends java.awt.Point(x, y)

object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}
