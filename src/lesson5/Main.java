package lesson5;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DeptEmployee[] department = new DeptEmployee[5];
		Professor prof1 = new Professor("lwam",LocalDate.of(2016, Month.AUGUST, 16),3200, 3);
	    Professor prof2= new Professor("cleave",LocalDate.of(2000, Month.MAY, 9),3000,2);
		Professor prof3 = new Professor("feven",LocalDate.of(1992, Month.APRIL, 1),5000,28);
	    Secretary sec1=new Secretary("camal",LocalDate.of(2000, Month.JANUARY, 9),900,5);
	    Secretary sec2=new Secretary("senu",LocalDate.of(2013, Month.JANUARY, 9),850,2);
        department[0]=prof1;
		department[1]=prof2;
		department[2]=prof3;
		department[3]=sec1;
		department[4]=sec2;
		double salary1=0;
		//System.out.println('Y');
		Scanner sc=new Scanner(System.in);
	   System.out.println("Do you want to see all the salaries in the department\n Enter Y if yes");
		String an=sc.nextLine().toUpperCase();
		if(an.equals("Y")){
			
			for(int i=0;i<department.length;i++){
			salary1+=department[i].computeSalary();}
			System.out.println("total salary of the Department is "+salary1+"$");
			
		}
		else
			System.out.println("nothing to show");
sc.close();
	}

}


