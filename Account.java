
public class Account {

	private int balance;
	
	Account(int initialBalance) {
		balance = initialBalance;
	}
	public void increase (int amount) {
		this.balance += amount;
	}
			
	public void decrease (int amount) {
		this.balance -= amount;
	}

	public int getBalance() {
		return balance;
	}
}
