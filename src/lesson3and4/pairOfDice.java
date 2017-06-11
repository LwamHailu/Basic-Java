package lesson3and4;

public class pairOfDice {

		public int die1; // Number showing on the first die.
		public int die2; // Number showing on the second die.
		
		public pairOfDice() {
		roll();// show some random values. Call the roll() method to roll the dice.
		}
		public pairOfDice(int val1, int val2) {
			die1=val1;// Constructor. Creates a pair of dice that
			die2=val2;// are initially showing the values val1 and val2.
		}
		public void roll() {
	      // Roll the dice by setting each of the dice (die1, die2) to be
	  
	    die1=(int)(Math.random()*6)+1;  // a random number between 1 and 6.
		die2=(int)(Math.random()*6)+1;
		
		//System.out.println("First Pair"+ die1+"\n" +"second pair"+ die2);
		
			
}
		}


