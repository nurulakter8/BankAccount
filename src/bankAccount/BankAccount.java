package bankAccount;

public class BankAccount {

	double balance;
	
	public BankAccount(double b) {
		balance = b;
		
	}
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	public void deposit(double amount) {
		balance = balance+amount;
	}
	public double getBalance() {
		return balance;
	}

}
