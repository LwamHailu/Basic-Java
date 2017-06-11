package lesson11;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		 HashMap<String, Course>  list=new HashMap<String, Course> ();
         list.put("CS390", new Course("FPP",new String[]{"lwam","zaid","Gebar"}));
		 list.put("CS400", new Course("MPP",new String[]{"renuka","Lerman","pulina"}));
	
		//System.out.println( list.containsKey("CS390"));
		//Set<>
     	Set<String>l=list.keySet(); 
		for(String k:l){
	   System.out.println(list.get(k));			  }
	   System.out.println(list);
	   System.out.println(list.get("CS390").getFaculty().length);	
	   System.out.println(list.values());
	   System.out.println(list.size());
	
	}
	

}
