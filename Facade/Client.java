package Facade;

public class Client {

	public static void main(String[] args) {
		OrderFacade facade = new OrderFacade();
		System.out.println(facade.order("2342"));
		System.out.println("Process done!");
	}
}
