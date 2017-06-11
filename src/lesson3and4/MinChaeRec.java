package lesson3and4;

import java.util.Scanner;

public class MinChaeRec {
   
    
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter you word");
	    String word=sc.nextLine();
	    System.out.println(MinChar(word,0));
sc.close();
	}
	public static String MinChar(String x,int z){
		String c;
		if(x.length()==0||x.equals(""))
			return null;
		c = x.substring(z);
		    while(z < x.length()){
		        if(x.substring(z,z+1).compareTo(c)<0){
		            c = x.substring(z,z+1);
		        }
		        z++;
		        MinChar(x, z);
		    }
		    return c;
		}
		
		
	}


