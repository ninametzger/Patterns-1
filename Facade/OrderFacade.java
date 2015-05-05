package Facade;

public class OrderFacade {
	private AccountingOffice payment = new AccountingOffice();
	private Warehousing inventory = new Warehousing();
	
	OrderFacade() {
		
	}

/* Orders an item depending on OrderID */
	public String order(String orderID) {
		String check = inventory.checkWarehouse(orderID);
		String paid = payment.paymentProcess(orderID);
		String subtract = inventory.subtractItem();
		return "Completed Tasks: \n" + check + "\n" + paid + "\n" + subtract;
	}
}
