package food.factory;

public class Client {

	public static void main(String[] args) {
		Food myFood = Restaurant.getFood();
		System.out.println("What to eat?");
		System.out.println("-> " + myFood.getValue());

	}

}
