package lesson5;

public class Test {


	public static void main(String[] args) {
		Person database[]=new Person[5];
		database[0]=new Person("Lwam hailu ","123-657-0976",27," F","2627 dfr Fairfield", 2345678);
		database[0].display();
		database[1]=new Student("lulu raesu","Computer",2017,3.85,"2345-789-0543",27," M"," 2627 dfr Fairfield",632199);
		database[1].display();
		database[2]=new Employee("Tek raesu ","Director",1999,"Finnce","123-657-0976",27," F","2627 dfr Fairfield", 2345678);
		database[2].display();
		database[3]=new HourlyEmplo("yonas raesu ",46,8,26,"postman","IT",2016,"123-657-0976",27," M","2627 dfr Fairfield", 2345678);
		database[3].display();
		database[4]=new SalariedEmplo("Abraham raesu ",21567,"Secretary","HRD",2014,"123-657-0976",27," M","2627 dfr Fairfield", 2345678);
		database[4].display();
		
	}

}
