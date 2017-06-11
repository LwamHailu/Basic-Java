package lesson1;

import java.util.Random;
import java.util.Scanner;

public class Username {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Name" + " &  " + "Enter Last name");

		String first = sc.nextLine();

		String Last = sc.nextLine();
		String output="";
		if (Last.length() < 5) {
			System.out.println("Last name must have at least five letters");
		} else {
			
			Random ran = new Random();
			for(int i=0;i<3;i++){
				output+=ran.nextInt(10);
			}
			
//			
			String Username =first.substring(0,1)+Last.substring(0,5)+output;
		    
			 System.out.println(Username);
		}
		sc.close();
	}

}
