package chap7
/**
 * @author volhovm
 *         Created on 7/27/14
 */
package com {
  package object horstmann {
    val proofValue = 42
  }
}

package com.horstmann.impatient {
  class Test2 {
//    val proof = proofValue     // ERROR
  }
}

package com.horstmann {
  package impatient {
    class Test {
      val realProof = proofValue  // OK
    }
  }
}


