package lesson8_9;

import java.util.Comparator;

public class Markiting {

	private String eName;
	private String pName;
	private double sAmount;
	
	public Markiting(String eName,String pName,double sAmount){
		this.eName=eName;
		this.pName=pName;
		this.sAmount=sAmount;
		}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getsAmount() {
		return sAmount;
	}

	public void setsAmount(double sAmount) {
		this.sAmount = sAmount;
	}

  public String toString(){
		return String.format("\n Employee name id "+geteName()+" Sales Amount is "+getsAmount()+" Product name is"+getpName());
	}
	
  public static final Comparator<Markiting> E_NAME = new Comparator<Markiting>() {
		public int compare(Markiting o1, Markiting o2) {
			String name1 =  o1.geteName();
			String name2 =  o2.geteName();
			return name1.compareTo(name2);
		}
	};
	public static  Comparator<Markiting> S_AMOUNT = new Comparator<Markiting>() {
		public int compare(Markiting o1, Markiting o2) {
			Double price1 = o1.getsAmount();
			Double price2 =o2.getsAmount();
			return price1.compareTo(price2);
		}
	};}

	
	

