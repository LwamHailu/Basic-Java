package exam;
import java.util.Date;

import java.util.ArrayList;
import java.util.Collections;

import exam.Item;

public class Driver2 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args){
	ArrayList<Item>list= new ArrayList<Item>();
   list.add(new Item("Selam",12345.00,new Date(2016,11,4)));
   list.add(new Item("Selam",12845.00,new Date(2017,1,20)));
   list.add(new Item("Lwam",12045.00,new Date(2007,13,16)));
   list.add(new Item("Eyob",12355.00,new Date(2015,18,14)));
   list.add(new Item("Ali",12145.00,new Date(2001,11,21)));
   list.add(new Item("Selam",12345.00,new Date(2016,1,4)));
   //list.add(new Item("fani",12345.00,new Date(12,12,2014)));
     System.out.println(list);
     System.out.println(list.get(0).equals(list.get(5))); 
     Collections.sort(list, Item.inName);
     System.out.println(list);
     Collections.sort(list, Item.iPrice);
     System.out.println(list);
     Collections.sort(list, Item.item);
     System.out.println(list);
     Collections.sort(list, Item.item);
     System.out.println(list);
     // System.out.println(Item.item.compare(list.get(2), list.get(3)));
   
  
   }
	
	

 

}
