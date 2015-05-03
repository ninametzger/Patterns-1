package withIteratorList;

import java.util.Iterator;


public class IteratorDemo {

	public static void main(String[] args) {
		CarList list = new CarList(3);
		list.write(new Car("BMW", 250), 0);
		list.write(new Car("VW", 140), 1);
		list.write(new Car("Ferrari", 500), 2);
		
		for(Car c : list)
		{
			System.out.println(c.toString());
		}
		
		
		System.out.println("#########################");
		Iterator<Car> iter = list.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next().toString());
		}
		
	}

}
