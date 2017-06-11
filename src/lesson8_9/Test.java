package lesson8_9;

import java.util.ArrayList;

import java.util.Collections;

public class Test {

public static void main(String[] args) {
       ArrayList<Markiting > list=new ArrayList<Markiting>();
		list.add(new Markiting ("Zaid","Coputer",22));
		list.add(new Markiting ("lwa","Mobile",33));
		list.add(new Markiting ("Tekel","Book",500));
		list.add(new Markiting ("lidiya","Laptop",300));
		System.out.println("original size is "+list.size());
		list.remove(2);
	    System.out.println(list.toString());
	    System.out.println("------------------------");
		Markiting newData=list.get(1);
		newData.seteName("bereket");
		newData.setpName("bshoes");
		newData.setsAmount(400);
		System.out.println("After Modifing "+list.toString()); 
		System.out.println("Size after removing is "+list.size());
		Collections.sort(list,Markiting.S_AMOUNT);
		for(Markiting r:list)
			System.out.println("Sorting By Sales Amount"+ r);
        Collections.sort(list,Markiting.E_NAME);
		for(Markiting r:list)
			System.out.println("Sorting By EMployee Name "+ r);
	}
	
	
}
