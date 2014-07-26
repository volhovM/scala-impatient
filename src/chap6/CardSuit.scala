package chap6

/**
 * @author volhovm
 *         Created on 7/5/14
 */
object CardSuit extends Enumeration {
  type CardSuit = CardSuit.Value
  val clubs = Value("♣")
  val spades = Value("♠")
  val diamonds = Value("♦")
  val hearts = Value("♥")
  private val types : String = "♠♣♥♦"
  def isRed(a : CardSuit) : Boolean = a == diamonds || a == hearts
}
