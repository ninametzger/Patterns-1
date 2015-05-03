package Facade;

public class AccountingOffice {
	
	AccountingOffice() {
		
	}

/* Checks, if bill is paid */
	public String paymentProcess(String orderID) {
		return "Bill for Order " + orderID + " is settled.";
	}
}
