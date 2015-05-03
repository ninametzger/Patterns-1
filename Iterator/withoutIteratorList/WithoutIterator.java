package withoutIteratorList;

public class WithoutIterator {

	public static void main(String[] args) {
		CarList list = new CarList(3);
		list.write(new Car("BMW", 250), 0);
		list.write(new Car("VW", 140), 1);
		list.write(new Car("Ferrari", 500), 2);
		
		
		//Works:
		System.out.println("There are the cars: ");
		for(int i = 0; i<list.getSize(); i++)
		{
			System.out.println(list.read(i).toString());
		}
		
		//Doenst work:
		/*
		for(Car car : list)
		{
			System.out.println(car.toString());
		}
		*/
	}

}
