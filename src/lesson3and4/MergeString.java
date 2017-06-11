package lesson3and4;

public class MergeString {

	public static void main(String[] args) {
	System.out.println(Merge("ace","bdf"));
      }
	
	public static String Merge(String str1,String str2){
		String word1= "";
		if(str1.length()==0 &&str2.length()==0){
	       return word1;
		}
		else if(str1.equals(str2)){
			return str1;
		}
	      
	     word1=word1+str1.charAt(0)+str2.charAt(0);  
		
	     return  word1+Merge(str1.substring(1),str2.substring(1)); 
	       
}
	}
