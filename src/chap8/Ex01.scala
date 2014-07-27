package chap8

/**
 * @author volhovm
 *         Created on 7/27/14
 */
class BankAccount (initialBalance: Double = 0) {
  protected var balance = initialBalance
  def deposit (value: Double) = { assert(value >= 0); balance += value }
  def withdraw (value: Double) = { assert(value >= 0); balance -= value }
}

class CheckingAccount(initialBalance: Double = 0) extends BankAccount(initialBalance) {
  override def deposit (value: Double) = { super.deposit(value); balance -= 1}
  override def withdraw (value: Double) = { super.deposit(value); balance -= 1}
}
