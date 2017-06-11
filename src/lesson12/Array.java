package lesson12;

public class Array {

	public static void main(String[] args) {
		int a[]= new int[3];
		try{
			System.out.println(a[7]);
		}
		catch(Exception s){//ArrayIndexOutOfBoundsException 
			System.out.println("errro");
					}

	}

}
