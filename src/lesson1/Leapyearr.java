package lesson1;
import java.util.Scanner;



public class Leapyearr {
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter   year");
	int year=sc.nextInt();
	int z=(year%4==0 && year%100!=0) ? 1 : (year%400==0) ? 1:0;
	
	if(z==1)
	System.out.println("It is a leap year");
	else
		System.out.println("it is not a leapyear");
	sc.close();
	}

}
