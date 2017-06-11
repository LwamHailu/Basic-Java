package lesson5two;

import java.util.Scanner;

public class ComputeAreaAndPerimeter {
	public static Shape getShape(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Choice:-\nC for Circle\nT for Triangle\nR for Rectangle");
		String choice=sc.nextLine().toUpperCase();
		Shape objR=new Rectangle();
		Shape objT=new Triangle();
		Shape obj=new Circle();
		switch(choice){
		case "C":
			return obj;
			
		case "R":
			return objR;
		case "T":
			return objT;
		default:
				 System.out.println("Invalid Input");
		
		}
		return null;
		
	
			
	}
	

	public static void main(String[] args) {
		Shape s=new Rectangle(5,6);
		Shape s1=new Triangle(5,6,2);
		Shape s2=new Circle(7);
		System.out.println("You select "+getShape().getClass().getSimpleName()+" Shape");
		System.out.println("\nThe detailed  information of each shape is below");
		System.out.println(s2.tosting()+" the Data is "+s2.readShapeData());
		System.out.println(s.tosting()+" the Datas are "+s.readShapeData());
		System.out.println(s1.tosting()+" the Datas are "+s1.readShapeData());
	
	}


}
