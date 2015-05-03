package withIteratorList;

public class Car {
	String brand;
	int hp;
	
	public Car(String brand, int hp)
	{
		this.brand = brand;
		this.hp = hp;
	}
	
	public String toString()
	{
		return brand + " (" + hp + "hp)";
	}
	
}
