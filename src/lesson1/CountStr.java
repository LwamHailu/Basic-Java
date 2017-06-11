package lesson1;

public class CountStr {

	public static void main(String[] args) {
		int count=0;
String str=" HAPPY DAY";
for(int i=0;i<str.length();i++){
	if(str.charAt(i)=='A')
		count++;

}
System.out.println("the length of the string is:-"+str.length()+ "\nNumber of A in the string is:- "+count);
	}

}
