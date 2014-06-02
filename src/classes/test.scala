package classes

import scala.collection.mutable.ArrayBuffer

/**
 * @author volhovm
 *         Created on 5/28/14
 */

object test {
  def main(args: Array[String]) {
    val arr: ArrayBuffer[Car] = new ArrayBuffer[Car]()
    arr += new Car("Opel", "GTC", 2013)
    arr += new Car("Lada", "Kalina")
    arr += new Car("Chevrolet", "Camaro", 2012, "US666FUCK")
    for (car <- arr) {
      println(car)
    }
  }
}
