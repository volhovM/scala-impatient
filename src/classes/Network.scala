package classes

import scala.collection.mutable.ArrayBuffer

/**
 * @author volhovm
 *         Created on 6/1/14
 */

class Network {
  class Member(val name: String){ val contacts = new ArrayBuffer[Member]}
  private val members = new ArrayBuffer[Member]
  def join(s: String) = {
    val m = new Member(s)
    members += m
    m
  }
}
