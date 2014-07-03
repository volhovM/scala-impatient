package classes

/**
 * @author volhovm
 *         Created on 6/2/14
 */

class BankAccount {
  private var innerBalance: Double = 0
  def deposit(a: Double) = innerBalance += a
  def withdraw(a: Double) { if (innerBalance >= a) innerBalance -= a; }
  def balance = innerBalance
}
