
public class Account {

	private double balance;
	
	Account(double initialBalance) {
		balance = initialBalance;
	}
	public void increase (double amount) {
		this.balance += amount;
	}
			
	public void decrease (double amount) {
		this.balance -= amount;
	}

	public double getBalance() {
		return balance;
	}
}
