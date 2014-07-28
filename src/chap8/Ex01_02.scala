package chap8

/**
 * @author volhovm
 *         Created on 7/27/14
 */

class BankAccount (initialBalance: Double = 0) {
  protected var balance = initialBalance
  def deposit (value: Double) = { assert(value >= 0); balance += value; balance }
  def withdraw (value: Double) = { assert(value >= 0); balance -= value; balance }
}

class CheckingAccount(initialBalance: Double = 0) extends BankAccount(initialBalance) {
  override def deposit (value: Double) = { super.deposit(value - 1); }
  override def withdraw (value: Double) = { super.deposit(value + 1); }
}

class SavingAccount(initialBalance: Double = 0, rate: Double = 0.026) extends BankAccount(initialBalance) {
  private var actions: Int = 0
  def earnMonthlyInterest = { actions = 0; balance += balance * rate }
  def payFine = if (actions > 3) balance -= 1 else actions += 1
  override def deposit (value: Double) = { payFine; super.deposit(value) }
  override def withdraw (value: Double) = { payFine; super.withdraw(value) }
}
