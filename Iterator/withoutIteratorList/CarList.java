package withoutIteratorList;

public class CarList {
	private Car[] cars;
	
	public CarList(int size)
	{
		cars = new Car[size];
	}
	
	public void write(Car car, int index)
	{
		cars[index] = car;
	}
	
	public Car read(int index){
		return cars[index];
	}
	
	public int getSize()
	{
		return cars.length;
	}
	
}
