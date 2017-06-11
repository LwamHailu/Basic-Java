package exam;

public class ElectronicProduct extends AProduct{
private double price;
	public ElectronicProduct(String name,String number,double price) {
		super(name,number);
		this.price=price;
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	double getPricce() {
		
		return price;
	}
	@Override
public String toString(){
	return String.format(getName()+""+ getNumber()+""+getPrice()+""+getPricce());
	
}
}
