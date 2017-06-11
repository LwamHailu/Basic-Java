package lesson3and4;

public class SavingsAccount {
	private static double annualInterestRate;
	private double savingBalance;
	double MonthlyInteres;
	public SavingsAccount(double s){
		this.savingBalance=s;
		annualInterestRate=0.0;
		
	}
	public static void modifyInterestRate(double newval){
		annualInterestRate =newval;
	}
	public void calculateMonthlyInterest(){
		double MonthlyInteres=savingBalance*((annualInterestRate)/12);
	    double  savingBalance1=savingBalance+MonthlyInteres;
	    System.out.println("saving balance with monthly interest :- "+savingBalance1);
	}
	
	public void calculateYearlyIntereset(){
		double YearlyIntereset=savingBalance*annualInterestRate;
	   double savingBalance1=this.savingBalance+YearlyIntereset;
	    System.out.println("Saving balance with Yearly interest:- "+savingBalance1);
	}
	    
	    
	public static void main(String[] args) {
		SavingsAccount saver1=new SavingsAccount(2000);
		SavingsAccount saver2=new SavingsAccount(3000);
		SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateYearlyIntereset();		
		SavingsAccount.modifyInterestRate(0.04);
		saver2.calculateYearlyIntereset();
		
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest ();
		SavingsAccount.modifyInterestRate(0.05);
	   saver2.calculateMonthlyInterest();
		
		
		
		
		
		

	}

}
