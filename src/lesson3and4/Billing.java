package lesson3and4;

public class Billing {
	
	double Bookprice;
	double coupon;
	int quantity;
	double total;
	double tax=.08;
	public double computeBill(double price){
		Bookprice=price;
		total=price+(price*tax);
		return total;
	}
	public double computeBill(double price,int q){
		Bookprice=price;
		quantity=q;
		total=(q*price)+(tax*price*q);
		return total;
	}
	public double computeBill(double price,int q,double c){
		Bookprice=price;
		quantity=q;
		coupon=c;
		double total1=(price*q)-(c*price*q);
		total=total1+(total*tax);
		return total;
		
		}
	
public static void main(String[] args) {
		
Billing book=new Billing();
System.out.println("The Price a Photobook is "+book.computeBill(10)+"$");
System.out.println("Total price of the books is"+book.computeBill(10,2)+"$");
System.out.println("Total price of a book with coupon is "+book.computeBill(10,2,0.05)+"$");
	}

}
