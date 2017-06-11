
public class Area {

	public static void main(String[] args) {
		Area sc=new Area();
		sc.area(7,3,6);
	}
	public void area(double r,int len,int wid){
		
		
		 double A=(Math.PI)*(Math.pow(r,2));
		 System.out.println("area of circle is "+ " "+ A);
		 int diag=(len*wid);
		 System.out.println("area of rectangle"+" "+diag);
	}

}
