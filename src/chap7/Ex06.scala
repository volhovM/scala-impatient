package chap7
import java.util.{HashMap => JHash}
import scala.collection.mutable.{Map => SHash}
import scala.collection.JavaConversions.mapAsScalaMap

/**
 * @author volhovm
 *         Created on 7/27/14
 */
class Ex06 {
  def hashConversion(map: JHash[Object, Object]) : SHash[Object, Object] = mapAsScalaMap(map)
}
