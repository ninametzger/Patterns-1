package withIteratorList;

import java.util.Iterator;

public class CarList implements Iterable<Car> {

    private Car[] cars;
    
    public CarList(int groesse) {
        cars = new Car[groesse];
    }
    
    public void write(Car wert, int index) {
        cars[index] = wert;
    }
    
    public Car read(int index) {
        return cars[index];
    }
    
    public int getSize() {
        return cars.length;
    }

    @Override
    public Iterator<Car> iterator() {
        return new CarIterator(this);
    }

    private static class CarIterator implements Iterator<Car> {

        private int index;
        private CarList list;
        
        public CarIterator(CarList list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.getSize();
        }

        @Override
        public Car next() {
            Car zahl = list.read(index);
            index++;
            return zahl;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported.");
        }
    }
}
