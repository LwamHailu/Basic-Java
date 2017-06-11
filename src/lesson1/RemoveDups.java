package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDups {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String arr[]=new String [5];
		System.out.print("Enter name of dogs");
		for(int i=0;i<arr.length;i++){
			
			arr [i]=sc.nextLine();
		}
		boolean isseen=false;
		int len=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<len;j++){
				if(arr[i].equals(arr[j])){
					isseen=true;
				
				}
			}
		
			if(isseen){
				
				arr[len]=arr[i];
				len++;
			}
			}
		
		
		String []newarr=new String[len];
		for(int z=0;z<len;z++){
			newarr[z]=arr[z];
		System.out.println(newarr[z]);
		}
//sc.close();
		
		//System.out.println(Arrays.toString(newarr));
		}
	
			}


