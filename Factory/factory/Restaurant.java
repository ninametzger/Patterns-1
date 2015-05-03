package food.factory;

import java.util.Date;

public class Restaurant{
	public static Food getFood() {
	Date now= new Date();
	@SuppressWarnings("deprecation")
	int hour= now.getHours();
	if (6 <= hour && hour < 11) {
	return new Breakfast();
	} else if (11 <= hour && hour < 16) {
	return new Lunch();
	} else if (16 <= hour && hour < 22) {
	return new Dinner();
	} else {
	return new NoEat();
	}
	}
}
