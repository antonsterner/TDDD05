import java.util.Hashtable;

public class Bank {

	Hashtable<Integer, Account> accountTable;
	private double stkPrice;
	private double stkQty;
	
	public Bank() {
		accountTable = new Hashtable<Integer, Account>();
	}
	
	public Account getAccountNo (Integer accountNo) {
		return accountTable.get (accountNo);
	}
	
	public void addAccountNo (Integer accountNo , double initialBalance) {
		accountTable.put (accountNo , new Account (initialBalance));
	}

	public void setStkPrice(double price) {
		this.stkPrice = price;
	}

	public void setStkQty(int qty) {
			this.stkQty = qty;
	}
	public double getStkPrice() {
		return stkPrice;
	}
	public double getStkQty() {
		return stkQty;
	}

	public void placeBuyOrder(int securityAC_no, int savingsAC_no, double qty, double buyPrice) {

		// Step 1: Check if the account has sufficient fund for transaction
		// (qty*stock price)
		if (!this.checkFunds(qty, savingsAC_no)) {
			System.out.println("Operation aborted due to insufficient funds in your saving account.");
		} else {
			// Step 2: Price matching
			if(this.priceMatch(buyPrice)) {
				// Step 3: Add balance 
				double amount = qty*buyPrice;
				this.getAccountNo(securityAC_no).increase(qty);
				
				// Step 4: Deduct balance
				this.getAccountNo(savingsAC_no).decrease(amount);
				// End of the operation
			}
		}
	}

	private boolean checkFunds(double qty, Integer accNumber) {
		
		double settlementMoney = qty * this.getStkPrice();
		if (this.getAccountNo(accNumber).getBalance() >= settlementMoney) {
			return true;
		} 
		return false;
	}
	
	public boolean priceMatch(double buyPrice) {
		if (stkPrice == buyPrice){
			System.out.println("Match with the market price.");
			return true;
		}
		System.out.println("Operation aborted due to mismatch of stock price.");
		return false;
	}
	
}
