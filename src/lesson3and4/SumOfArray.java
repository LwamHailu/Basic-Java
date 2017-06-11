package lesson3and4;

public class SumOfArray {
	static int i=0;
	static int sum=0;

	public static void main(String[] args) {
		int a[]={1,3,5,6,7};
		System.out.println(sArray(a));

	}
	
	public static int sArray(int a[]){
		//int sum=0;
		if(a.length==0 ||a.length<=i)
			return 0;
		else
			return sum+a[i++]+sArray(a);
	
	}

}
