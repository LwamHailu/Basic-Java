package lesson8_9;

public class BinarySearch {
public final static int NOT_FOUND=-1;


public int binarysearch(int a[],int num){
	
	int low=0,
		high=a.length-1,
		mid=(low+high)/2;
	while(low<=high&&a[ mid]!=num){
		if(a[mid]<num){
			low=low+1;
			}
		else{
			high=mid-1;
		}
		mid=(high+low)/2;
	}
	if(low>high){
		mid=NOT_FOUND;
	}
	return mid;
}
	public static void main(String[] args) {
		
		BinarySearch bin= new BinarySearch();
		int b[]={3,4,5,6,7,8,9,10};
		System.out.println(bin.binarysearch(b, 11));
	}

}
