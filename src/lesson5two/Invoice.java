package lesson5two;

public class Invoice implements Payable{
private String partNumber;
private String partDescription;
private int qauntity;
private double pricePerltem;
	public Invoice(String partNumber,String partDescription, int qauntity, double pricePerltem) {
	this.partNumber=partNumber;
	this.partDescription=partDescription;
	this.qauntity=qauntity;
	this.pricePerltem=pricePerltem;
	}

	@Override
	public double getPayAmount() {
		return pricePerltem*qauntity;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQauntity() {
		return qauntity;
	}

	public void setQauntity(int qauntity) {
		this.qauntity = qauntity;
	}

	public double getPricePerltem() {
		return pricePerltem;
	}

	public void setPricePerltem(double pricePerltem) {
		this.pricePerltem = pricePerltem;
	}
public String toString(){
	return String.format("part description"+getPartDescription()+" price "+ getPricePerltem()+" Quantity "+getQauntity()+" Part Number "+getPartNumber());
}
}
