package lesson1;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int num=0,digits=0, k =0;;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five digit Number");
		 num=sc.nextInt();
		 int i=num;
		while(i>0){
			digits++;
			i/=10;
		}
		while(digits!=5){
	System.out.println("Error its not a five digit number"+" Enter five digit Number");
		  num=sc.nextInt();}
		int a[]={num};
		for(int j=0;j<a.length;j++){
			if(a[j]!=a[(a.length-1)-j]){
				k++;
				
				}
			
		}
		if(k==0){
		System.out.println("it is  a polindrome");}
		else{
			System.out.println("it is not a polindrome");
		
		}
		

	sc.close();

}}
