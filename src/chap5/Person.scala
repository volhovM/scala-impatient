package chap5

/**
 * @author volhovm
 *         Created on 6/2/14
 */

class Person(nameSurname: String, personAge: Int) {
  val age = if (personAge > 0) personAge else 0
  if (!nameSurname.contains(" ")) throw new Exception("Wrong nameSurname format")
  val firstName = nameSurname.split("\\s+")(0)
  val secondName = nameSurname.split("\\s+")(1)
  override def toString = "Person: " + firstName + " " + secondName
}
