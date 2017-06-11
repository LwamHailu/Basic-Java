package lesson1;


import java.util.Scanner;


public class Amount {
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount");
	double	a=sc.nextDouble();
	int dollar=(int)a;
	int cents=(int) Math.round((a-dollar)*100);
	int qarters=cents/25;
	cents=cents%25;
	int dimes=cents/10;//10cents
	cents=cents%10;
	int nickles=cents/5; //5 cents
	cents=cents%5;
	int pennie=cents/1; // cent
	cents=cents%1;
	System.out.println("No dollars:- "+ dollar +"  No qarters:- "+qarters+" No dimes:- "+ dimes+ "  No Nickles:- "+nickles+"No pennie:-"+pennie);
	
		sc.close();
	}

}
