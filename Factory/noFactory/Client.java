package food.noFactory;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now= new Date();
		@SuppressWarnings("deprecation")
		int hour= now.getHours();
		
		System.out.println("What to eat?");
		if (6 <= hour && hour < 11) {
		Breakfast myFood = new Breakfast ();
		System.out.println("-> " + myFood.getValue());
		}else if (11 <= hour && hour < 16) {
		Lunch myFood = new Lunch ();
		System.out.println("-> " + myFood.getValue());
		} else if (16 <= hour && hour < 22) {
		Dinner myFood = new Dinner ();
		System.out.println("-> " + myFood.getValue());
		} else {
		NoEat myFood = new NoEat ();
		System.out.println("-> " + myFood.getValue());
		}

	}

}
