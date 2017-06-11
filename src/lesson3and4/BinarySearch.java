package lesson3and4;

public class BinarySearch {
	static int index=0;
	public static void main(String []args){
		int arr[]={1,2,3,5,6,7,8};
		int len =arr.length;
		if(BinSe(arr,7,len))
	   System.out.println("number found ");
		else
			System.out.println("number  not found ");
			
		
	}
	public static boolean BinSe(int a[],int num,int len){
		
		if(a.length==0 ||num>a.length)
			return false;
	
		int mid=(index+len)/2;
		
		if(a[mid]==num){
			return true;}
		else if(a[mid]>num){
			index=mid-1;
		return	BinSe(a,num,index);}
		else if(a[mid]<num){
			index=mid+1;
		return BinSe(a,num,index);}
		else
			
		return false;
	}

}
