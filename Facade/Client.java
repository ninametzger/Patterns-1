package Facade;

public class Client {

	public static void main(String[] args) {
		OrderFacade facade = new OrderFacade();
		facade.order("2342");
		System.out.println("Process done!");
	}
}