package chap6

/**
 * @author volhovm
 *         Created on 7/4/14
 */

class UnitConversion (k : Double) {
  def direct(a: Double) = a * k
  def back(a: Double) = a / k
}

object InchesToCentimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.75)
object MilesToKms extends UnitConversion(1.6)



