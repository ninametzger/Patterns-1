package Facade;

public class OrderFacade {
	private AccountingOffice payment = new AccountingOffice();
	private Warehousing inventory = new Warehousing();
	
	OrderFacade() {
		
	}

/* Orders an item depending on OrderID */
	public void order(String orderID) {
		String check = inventory.checkWarehouse(orderID);
		String paid = payment.paymentProcess(orderID);
		String subtract = inventory.subtractItem();
		System.out.println("Completed Tasks: \n" + check + "\n" + paid + "\n" + subtract);
	}
}
