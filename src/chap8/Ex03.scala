package chap8

/**
 * @author volhovm
 *         Created on 7/28/14
 */

trait Existing {
  var coordinate: (Int, Int)
}

trait Living {
  var lifeCoeff: Double // years to live, nearly
  var health: Int = 100
  def sleep = if (health >= 100) health = 80 else health += 10
  def live = health -= (1/lifeCoeff).toInt
  def die = { health = 0
//    this.finalize()  // it's not compiling
  }
}

trait Feeling extends Living {
  def enjoyBeing = lifeCoeff += 1
  def suffer = lifeCoeff -= 1
}

trait Moving extends Existing {
  val speed: Int
  def moveUp = coordinate = (coordinate._1 + speed, coordinate._2)
  def moveDown = coordinate = (coordinate._1 - speed, coordinate._2)
  def moveLeft = coordinate = (coordinate._1, coordinate._2 - speed)
  def moveRight = coordinate = (coordinate._1, coordinate._2 + speed)
}

trait Speaking {
  val phrase: String
  def say = print("%s-%s-%s!".format(phrase, phrase, phrase.capitalize))
}

//////////////////////////////////////////////////////////////////////////////////////

class HolySpirit extends Speaking {
  // God is everywhere (not extending Existing)
  override val phrase: String = "It's a sin!"
}

class Ghost extends HolySpirit with Moving{
  override val speed: Int = 1 // very slow, bad ghost
  override val phrase: String = "Boo~"
  override var coordinate: (Int, Int) = (0,0)
}

class Fish(s: Int = 3, l: Int = 2) extends Living with Moving { // Mute
  override var lifeCoeff: Double = l
  override val speed: Int = s
  override var coordinate: (Int, Int) = (0,-11030) // Mariana Trench
}

class TalkingShark extends Fish(60) with Speaking { // Fast!
  override val phrase: String = "bulbulb kill"
}

class Cow extends Fish(10, 40) with Speaking { // Am i doing it wrong?
  override val phrase: String = "Moo"
  coordinate = (0, 2000) //Alps
}

class Coder extends Cow with Feeling { // Darwin, don't resist, it's 3:30 AM
  override val phrase: String = "What is the sence of asking myself: '" + phrase
  override val speed: Int = 15
  health = 110 // Lucky!
  lifeCoeff = 70
  coordinate = (0,0)
  def lifeStart = {
    1 to 17 foreach(_ => {sleep; enjoyBeing; live})
    def code = suffer // 3:40 AM
    18 to 70 foreach (_ => {sleep; code; live})
    die
  }
}


