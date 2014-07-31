package chap8

/**
 * @author volhovm
 *         Created on 7/31/14
 */
abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(override val price: Double, override val description: String) extends Item

class Bundle(val items: List[Item] = List()) extends Item {
  def add(a: Item) = a :: items
  override def price: Double = items.map(_.price).sum
  override def description: String = items.map(_.description).mkString(", ")
}
