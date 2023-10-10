package oops;
/**
 * Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
 *  Create a subclass called SavingsAccount that overrides the withdraw() method to prevent 
 *  withdrawals if the account balance falls below one hundred.
 */

class BankAccount{
	int balance=100;
	
	
	public void deposit(int amount) {
		balance+=amount;
	}
	public void withdraw(int amount) {
		if(amount>=balance) {
			balance-=amount;
		}
		else {
			System.out.println("no amount in account");
		}
	}
}
public class SavingsAccount  extends BankAccount{
	public void withdraw(int amount) {
		if(balance<100) {
			System.out.println("minmum 100 is required");
		}
		else {
			super.withdraw(amount);
		}
	}
public static void main(String[] args) {
	
	SavingsAccount s = new SavingsAccount();
	s.withdraw(500);
}
	
}
