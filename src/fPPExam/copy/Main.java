package fPPExam.copy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	List<Payable>list=new ArrayList<>();
	list.add(new Employee("lwam",12));
	list.add(new Employee("tekle",783));
	list.add(new Employee("selam",123));
	list.add(new Employee("kiflu",893));
	list.add(new Manager("Zaid",123,35));
	list.add(new Manager("abinur",123,15.45));
	list.add(new Manager("tesfat",1256,25));
	list.add(new Manager("lulu",600.98,75));
	System.out.println(Statistics.computeSalary(list));
	for(Payable l:list)
	System.out.println(l+l.getClass().getSimpleName());
	}

}
