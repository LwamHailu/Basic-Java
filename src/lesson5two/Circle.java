package lesson5two;

public class Circle extends Shape {
private double raduis;
final double pi=Math.PI;
	public Circle(double raduis) {
		this.raduis=raduis;
		
	}
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double computeArea() {
		
		return Math.round(pi*Math.pow(raduis, 2));
	}
	public double getRaduis() {
		return raduis;
	}
	public void setRaduis(double raduis) {
		this.raduis = raduis;
	}
	@Override
	public double computePerimeter() {
		
		return Math.round(2*pi*raduis);
	}
	@Override
	public String readShapeData() {
		
		return String.format("raduis is "+getRaduis() ) ;
	}
	@Override
	public String tosting() {
		
		return String.format("the shape is "+ getShapeName()+" Area "+computeArea()+" Perimeter is "+computePerimeter()+"") ;
	}
	@Override
	public String getShapeName() {
		
		return "Circle";
	}
	

}
