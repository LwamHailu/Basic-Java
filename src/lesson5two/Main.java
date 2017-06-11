package lesson5two;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer ob = new Computer("Dell "," intel 4",3 , 500,2);
		Computer ob1 = new Computer("HP "," intel 4",2 , 350,4);
		ob.setRamSize(2);
		ob.setProcessorSpeed(5);
		ob1.setRamSize(3);
		ob1.setProcessorSpeed(4);
		System.out.println("Computer 1:- "+ob.tostring()+"\nComputer 2:- "+ob1.tostring());
		if(ob.equals(ob1))
			System.out.println("thry are equal ");
		else
			System.out.println("they are not  equal ");
	}

}
