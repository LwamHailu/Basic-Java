package lesson8_9;

import java.util.Arrays;
import java.util.Random;

public class Array {

	public  static int[] duplicate(int a[]){
		int b[]=new int [a.length];
		int index=0;
	for(int i=0;i<a.length;i++){
			boolean isseen=false;
			for(int j=0;j<index;j++){
				if(a[i]==a[j]){
					isseen=true;
					break;
				}
			}
			if(!isseen){
				b[index]=a[i];
				index++;
			}
		}
	int s[]=new int[index];
	for(int z=0;z<index;z++){
		s[z]=b[z];
	}
	return s;
		}
		public static int[] empty(int a[]){
			int arr[]={};
			a=arr;
			return a;
		}
	
		public static int[] sublist(int a[],int initial,int last){
		int len=last-initial;
		int b[]=new int [len];
		System.arraycopy(a,initial,b,0,len);
			return b;
		}
		public static int value(int a[],int x){
			for(int i=0;i<a.length;i++){
				if(a[i]==a[x]){
					return a[i];
				}
			}
			return 0;
		}
	public static void main(String[] args) {
		
		int arr[]= new int[50];
		for(int i=0;i<arr.length;i++){
			Random rand=new Random();
			int num=rand.nextInt(100);
			arr[i]=num;
	}
		//System.out.println(Arrays.toString(arr));
		int b[] = duplicate(arr);
		 System.out.println(" Array when Duplicate removed "+Arrays.toString(b));
		 System.out.println("Lenght when duplicate removed is "+b.length);
		 System.out.println(Arrays.toString(empty(arr)));
		 int c[]=empty(arr);
		 System.out.println("Length when array is Empty "+c.length);
		 System.out.println("Arrays between ranges "+Arrays.toString(sublist(arr,3,8)));
		 System.out.println("the value at specifi index "+value(arr,5));
		
	}

		
}
