package chap5

/**
 * @author volhovm
 *         Created on 6/2/14
 */

class Car(val producer: String, val model: String, val year: Int = -1, val number: String = "") {
  override def toString = "Car: " + producer + " " + model +
    {if (year == -1) "" else " " + year} + {if (number == "") "" else " " + number}
}
