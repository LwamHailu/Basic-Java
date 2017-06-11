package fPPExam;

import java.util.ArrayList;
import java.util.List;

public class Main {

//	public static void main(String[] args) {
//	List<Payable>list=new ArrayList<>();
//	list.add(new Employee("lwam",12));
//	list.add(new Employee("tekle",783));
//	list.add(new Employee("selam",123));
//	list.add(new Employee("kiflu",893));
//	list.add(new Manager("Zaid",123,35));
//	list.add(new Manager("abinur",123,15.45));
//	list.add(new Manager("tesfat",1256,25));
//	list.add(new Manager("lulu",600.98,75));
//	System.out.println(Statistics.computeSalary(list));
//	for(Payable l:list)
//	System.out.println(l+l.getClass().getSimpleName());
//	}
	 
		public static void main(String[] args) {
			List<Employee> emps = new ArrayList<>();
			emps.add(new Employee("John", 110000));
			emps.add(new Employee("Tom", 110000));
			emps.add(new Employee("Edward", 120000));
			emps.add(new Employee("Rich",90000));
			emps.add(new Employee("Kevin", 100000));

			List<Manager> managers = new ArrayList<>();
			managers.add(new Manager("Andrew", 110000, 10000));
			managers.add(new Manager("Rabelais", 130000, 5500));
			managers.add(new Manager("Phil", 135000, 12000));
			managers.add(new Manager("Tony",95000, 8000));
			
			
			double salarySum = 0.0;
			//implement by combining the lists above into a single list and passing to 
			//computeSumOfSalaries below
			ArrayList<Payable> combList = new ArrayList<Payable> ();
			
			combList.addAll(emps);
			//System.out.println("Salary of employees: " + Statistics.computeSumOfSalaries(combList));
			
			combList.addAll(managers);
			//System.out.println("Salary of managers: " + Statistics.computeSumOfSalaries(combList));
			
			//double salarySum = Statistics.computeSumOfSalaries(/*implement */);
			salarySum = Statistics.computeSalary(combList);
			System.out.println(salarySum);
			
}
}