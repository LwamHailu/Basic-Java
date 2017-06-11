package lesson8_9;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

// Priority Queue Implementation using Comparator
class Sale 
{
	int sid;
	String item;
	double price;

	public Sale(int sid, String item, double price) {
		this.sid = sid;
		this.item = item;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

		
	 public String toString() {
	        return  "Sid=" + sid + ", Item Name=" + item + ", Item Price=" + price ;
	    }
}

