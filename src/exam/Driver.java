package exam;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		
AProduct []a=new ElectronicProduct[3];
a[0]=new ElectronicProduct("lwam","10",10);
a[1]=new ElectronicProduct("zaid","14",30);
a[2]=new ElectronicProduct("baba","17",20);
double tem=0;
AProduct c = null;
for( AProduct b:a){
	if(tem<b.getPricce()){
		tem=b.getPricce();
		c=b;
	}
} 

System.out.println(c.getName());
System.out.println(c.toString());

	}

}
