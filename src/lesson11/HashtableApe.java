package lesson11;

import java.io.IOException;
import java.util.Scanner;

class HashTableApp {
	public static void main(String[] args) throws IOException {
		String aKey;
		String value;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of hash table: ");
		int size = in.nextInt();

		HashTable theHashTable = new HashTable(size);

		theHashTable.insert("F", "FPP");
		theHashTable.insert("J", "Java");
		theHashTable.insert("S", "SE");
		theHashTable.insert("C", "C#");

		while (true) // interact with user
		{
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, delete, or find: ");
			char choice = in.next().charAt(0); // Read a Char from the console
			switch (choice) {
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter the key: ");
				aKey = in.next();
				System.out.print("Enter the value to insert: ");
				value = in.next();
				
				theHashTable.insert(aKey, value);
				break;
			case 'd':
				System.out.print("Enter key value to delete: ");
				aKey = in.next();
				theHashTable.delete(aKey);
				break;
			case 'f':
				System.out.print("Enter key value to find: ");
				aKey = in.next();
				System.out.println("Key Found status " + theHashTable.find(aKey));
				break;
			default:
				System.out.print("Invalid entry\n");
			} // end switch
		} // end while
	} // end main()
		// --------------------------------------------------------------
} // end class HashTableApp