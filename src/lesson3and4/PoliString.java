package lesson3and4;

import java.util.Scanner;

public class PoliString {
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the word");
		String word=sc.nextLine().toLowerCase();
		if(isPolindrom(word))
		System.out.println("it is a polindrom");
		else
			System.out.println("it is not a polindrom");
		sc.close();
	}
	public static boolean isPolindrom(String str){
		if(str.length()==0||str.length()==1)
			return true;
	if(str.charAt(0)==str.charAt(str.length()-1))
			
	      return  isPolindrom(str.substring(1,str.length()-1));
	else
		return false;
				
		
	}

}
