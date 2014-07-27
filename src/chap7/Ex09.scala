package chap7

/**
 * @author volhovm
 *         Created on 7/27/14
 */
object Ex09 {
  print(if (isStrong(Console.in.readLine())) System.getProperties.getProperty("user.name") else "Weak password")
  def isStrong(a: String) : Boolean = a.length > 5 && true // add some extra cases
}
