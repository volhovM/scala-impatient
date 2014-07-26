package chap6

/**
 * @author ${USERNAME}
 *         Created on 7/27/14
 */
object RGBCube extends Enumeration {
  type CubeVertex = RGBCube.Value
  val Black = Value(0x000000)
  val Red = Value(0xff0000)
  val Green = Value(0x00ff00)
  val Blue = Value(0x0000ff)
  val Yellow = Value(0xffff00)
  val Cyan = Value(0x00ffff)
  val Magenta = Value(0xff00ff)
  val White = Value(0xffffff)
}
