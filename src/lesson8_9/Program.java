package lesson8_9;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

	// Create an ArrayList of objects.
	ArrayList<Philosopher> list = new ArrayList<>();
	list.add(new Philosopher(1, "Socrates"));
	list.add(new Philosopher(2, "Plato"));
	 

	// Display our objects.
	for (Philosopher p : list) {
	    System.out.println(p);
	}
    }
}