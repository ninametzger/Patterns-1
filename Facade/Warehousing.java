package Facade;

public class Warehousing {
	private String first;
	private String second;
	
	Warehousing () {
		
	}
	
/* Checks Stock for available items */
	public String checkWarehouse(String orderID) {
		first = "Stock is checked:";
		second = "For Order " + orderID + " are enough items available.";
		return first + " " + second;
	}

/* Subtracts one item from Stock*/
	public String subtractItem() {
		return "The item is shipped and has been subtracted from Stock.";
	}
	
/* Getter and Setter */
	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}
}
