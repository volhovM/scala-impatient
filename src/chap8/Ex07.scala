package chap8

/**
 * @author volhovm
 *         Created on 8/1/14
 */
class Square(x: Int, y: Int, a: Int) extends java.awt.Rectangle(x, y, a, a) {
  def this() = this(0, 0, 0)
  def this(a: Int) = this(0, 0, a)
}
