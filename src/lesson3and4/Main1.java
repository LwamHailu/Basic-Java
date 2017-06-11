package lesson3and4;

public class Main1 {
	
		public static void main(String[] args) {
		int count=0;
			pairOfDice d1=new pairOfDice();	// Create two object for the PairOfDice
			pairOfDice d2=new pairOfDice(2,5);
			
		while(true){
			d1.roll();
			d2.roll();
			count++;
			if(d1.die1+d1.die2!=d2.die1+d2.die2){
				System.out.println("First pair come up total "+d1.die1+d1.die2 +"\n"+"Second paircome up with total "+ d2.die1+d2.die2);
			}
			else
			{
				System.out.println("First pair come up total:- "+d1.die1+d1.die2 +"\n"+"Second paircome up with total:- "+ d2.die1+d2.die2);
				
				break;
			}
			
			
		}
		System.out.println("it took "+ count+" to reach the same value");
		
		}
		

}
