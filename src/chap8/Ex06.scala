package chap8

/**
 * @author volhovm
 *         Created on 8/1/14
 */
abstract class Shape {
  def centerPoint: (Int, Int)
}

class Rectangle(x1: Int, y1: Int, x2: Int, y2: Int) extends Shape {
  override def centerPoint = ((x1 + x2) / 2, (y1 + y2) / 2)
}

class Circle(x: Int, y: Int, radius: Double) extends Shape {
  override def centerPoint = (x, y)
}