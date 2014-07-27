package chap7

/**
 * @author volhovm
 *         Created on 7/27/14
 */
package object random {
  private var seed = 21
  private val a = 1664525
  private val b = 1013904223
  private val n = 32
  def nextInt: Int = { seed = seed * a + b % (2 ^ n); seed }
  def nextDouble: Double = nextInt * Double.MinPositiveValue
  def setSeed (x: Int) = seed = x
}
