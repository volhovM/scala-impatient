package chap5

/**
 * @author volhovm
 *         Created on 6/2/14
 */

class Time(hrs: Int, min: Int) {
  var totalMinutes: Int = -1
  if (hrs >= 0 && hrs < 24)
    if (min >=0 && min < 60)
      totalMinutes = hrs * 24 + min
    else throw new Exception("Wrong minute format")
  else throw new Exception("Wrong hours format")

  def before(other: Time) : Boolean = toMinutes < other.toMinutes
  private[Time] def toMinutes : Int = totalMinutes
}


