package chap8

/**
 * @author volhovm
 *         Created on 8/1/14
 */
class Person(name: String) {
  override def toString = "Person: ${name}"
}

class SecretAgent extends Person("SECRET"){
  override def toString: String = "SECRET"
}
