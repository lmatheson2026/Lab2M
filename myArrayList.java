import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class myArrayList {
	private Fraction[] array;
	private int size;
	private int cap;
	private double growthFactor;
	public class MyListIterator implements Iterator<Fraction>{
		private int currentIndex;
	public MyListIterator() {
			
			currentIndex = 0;
		}
		/*
		 * Checks to see if hasNext returns true, 
		 * if it does, then moves the iterator forward
		 *  one index. If not found, throws exception
		 */
		public Fraction next() {


			if (hasNext()) {
				return array[currentIndex++];
			}else {
				 throw new NoSuchElementException("No fractions found");
			}
		
		}
		/*
		 * Checks to see if hasPrevious returns true, 
		 * if it does, then moves the iterator back one 
		 * index. If not found, throws exception
		 */
		public Fraction previous() {
			if (hasPrevious()) {
				return array[--currentIndex];
			} else {
				 throw new NoSuchElementException("No fractions found");;
			}
		}
    
        public boolean hasNext(Fraction[] a) {
            
            boolean next = false;
            
            for (int i = 0; i < size; i++) {
                if (a[i] != null) {
                    next = true;
                }
                else {
                    next = false;
                }
            }
            return next;
        }

        public boolean hasPrevious() {
            
            return false;
        }
}

	
	}
	//returns MyListIterator
	public MyListIterator getIterator() {
		return new MyListIterator();
	}
	public myArrayList() {
		this.cap = 50;
		this.array = new Fraction[cap];
		this.size = 0;
		this.growthFactor = 1.2;
	}
	public int indexOf(Fraction input) {
		for (int i = 0; i < size; i++) {
			if (array[i].equals(input)) {
				return i;
			}
		}
		return -1;
	}
	//allows a fraction object to be added into a certain index
	public void add(int index, Fraction input) {
		//makes sure there is room for the fraction
		if (size == cap) {
			// Increase capacity by 20% (growth factor) if more room is needed
			cap = (int) (cap * growthFactor);
			array = Arrays.copyOf(array, cap);
		}

		// Shift elements to the right to make space for the new element
		for (int i = size; i > index; i--) {
			array[i] = array[i - 1];
		}

		// Insert the new element at the index
		array[index] = input;
		size++;
	}
	public Fraction remove(int index) {
		Fraction removedElement = array[index];
		// Shift elements to the left to fill the gap
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		// Set the last element to null and decrease the size
		array[size - 1] = null;
		size--;
		
		return removedElement;
	}
	
	//Prints result
	public void print() {
		for (int i = 0; i < size; i++) {
			array[i].print();
		}
	}
}