import java.util.Hashtable;

public class Bank {

	Hashtable<Integer, Account> accountTable;
	private double stkPrice;
	private int stkQty;
	
	public Bank() {
		accountTable = new Hashtable<Integer, Account>();
	}
	
	public Account getAccountNo (Integer accountNo) {
		return accountTable.get (accountNo);
	}
	
	public void addAccountNo (Integer accountNo , int initialBalance) {
		accountTable.put (accountNo , new Account (initialBalance));
	}

	public void setStkPrice(double price) {
		this.stkPrice = price;
	}

	public void setStkQty(int qty) {
		// TODO Auto-generated method stub
		this.stkQty = qty;
	}
	public double getStkPrice() {
		return stkPrice;
	}
	public int getStkQty() {
		return stkQty;
	}

	public void placeBuyOrder(int securityAC_no, int savingsAC_no, int qty, double stockPrice) {

		// Step 1: Check if the account has sufficient fund for transaction
		// (qty*stock price)
		// If yes, call the role Bank for price matching
		if (!this.checkFunds(qty, savingsAC_no)) {
			System.out.println("Operation aborted due to insufficient funds in your saving account.");
		} else {
			this.priceMatch(stockPrice);
		}
	
	}

	private boolean checkFunds(int qty, Integer accNumber) {
		
		double settlementMoney = qty * this.getStkPrice();
		if (this.getAccountNo(accNumber).getBalance() >= settlementMoney) {
			return true;
		} 
		return false;
	}
	
	// Step 2: Price matching
	public boolean priceMatch(double stockPrice) {
		if (stkPrice == stockPrice){
			System.out.println("Match with the market price.");
			return true;
		}
		System.out.println("Operation aborted due to mismatch of stock price.");
		return false;
	}


	// Step 3: Add balance 
	// Then call the role SavingsAC to deduct money
	
	// Step 4: Deduct balance
	// End of the operation
	
	//placeBuyOrder
	
}
