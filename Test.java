
public class Test {



	public static void main(String[] args) {
		/*
		Test Case - Place buy order
		User input: price, quantity, account no
		 */
		System.out.println("Begin test");
		Bank bank = new Bank();
		int savingsAC_no = 123456789;
		int securityAC_no = 987654321;
		int int_money = 500000;
		int int_qty = 1000;
		// Initialize bank
		bank.addAccountNo (savingsAC_no, int_money);
		bank.addAccountNo (securityAC_no, int_qty);
		
		// Initialize the market price and qty in the bank;
		double int_mrtPrice = 30;
		int totalQty = 1000000;
		bank.setStkPrice(int_mrtPrice);
		bank.setStkQty(totalQty);
		
		System.out.println("Place a buy order:");
		int qty = 1000;
		double stockPrice = 30;
		
		bank.placeBuyOrder(securityAC_no, savingsAC_no, qty, stockPrice);
		
      	System.out.println("End test");
	}
}
