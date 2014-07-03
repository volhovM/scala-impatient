package classes

/**
 * @author volhovm
 *         Created on 6/2/14
 */

class Counter(private var counter: Int = 0) {
  def increment() = {if (counter != Integer.MAX_VALUE) counter += 1; counter}
  def current = counter
}