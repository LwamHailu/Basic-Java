package lesson8_9;


import java.util.Scanner;
import java.util.Stack;

public class Polindrom {
	
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the word");
String input=sc.nextLine();
Stack<Character> list= new Stack<Character>();
for(int i=0;i<input.length();i++){
list.push(input.charAt(i));
}

if(Poli(list,input))
	System.out.println("It is  a polindrom");
else
	System.out.println("It is  a  not Polindrom");

sc.close();

}
public static  boolean Poli(Stack<Character>l, String in){
	for(int i=0;i<in.length()/2;i++){
		if(in.charAt(i)!=l.pop()){
			return false;
		}
		}
	return true;
}
}