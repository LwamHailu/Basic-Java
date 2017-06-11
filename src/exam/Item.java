package exam;

import java.util.Comparator;
import java.util.Date;

public class Item {
	String iname;
	double iprice;
	Date pdate;
public Item( String iname,double iprice,Date pdate){
	this.iname=iname;
	this.iprice=iprice;
	this.pdate=pdate;
	
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public double getIprice() {
	return iprice;
}
public void setIprice(double iprice) {
	this.iprice = iprice;
}
public Date getPdate() {
	return pdate;
}
public void setPdate(Date pdate) {
	this.pdate = pdate;
}
public boolean equals(Object o){
	if(o==null)
		return false;
	else if(!(o instanceof Item)){
		return false;
		}
	Item p=(Item)o;
	
	boolean result= this.getIprice()==p.getIprice()&&this.getIname().equals(p.getIname())&&this.getPdate().equals(p.getPdate());
	return result;
}

public int hashCode(){
	int ret = 17;
	ret = ret*31 + this.getIname().hashCode();
	ret = ret*31 + (int)Math.round(this.getIprice());
	ret = ret*31 + this.getPdate().hashCode();
	return ret;
	
}
public static Comparator<Item>inName=new Comparator<Item>(){

	@Override
	public int compare(Item o1, Item o2) {
		
		return o1.getIname().compareTo(o2.getIname());
		
	}
	
};
public static Comparator<Item>iPrice=new Comparator<Item>(){

	@Override
	public int compare(Item o1, Item o2) {
		
		return (int)(o1.getIprice()-o2.getIprice());
		
	}
	
};

public static Comparator<Item>item=new Comparator<Item>(){

	@Override
	public int compare(Item o1, Item o2) {
		
		if(o1.getIname().equals(o2.getIname())){
			if(o1.iprice==o2.iprice){
				return o1.pdate.compareTo(o2.pdate);
			}else{
				return o1.iprice < o2.iprice ? -1:1;
			}
	
		}else{
			return o1.getIname().compareTo(o2.getIname());
		}
	}
		
};

public String toString(){
	return String.format("%s %tD %sf\n", getIname(), getPdate(), getIprice());
	
}

}
