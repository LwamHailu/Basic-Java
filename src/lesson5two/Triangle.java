package lesson5two;

public class Triangle extends Shape {
private double base;
private double height;
private double base1;
	public Triangle(double base,double base1,double height) {
		this.base=base;
		this.base1=base1;
		this.height=height;
	}
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double computeArea() {
		double s=(base+height+base1)/2;
		return Math.round( Math.sqrt(s * (s - base) * (s - height) * (s - base1)));
	}
	@Override
	public double computePerimeter() {
		
		return base+height+base1;
	}
	@Override
	public String readShapeData() {
		
		return String.format("the sides of a triangle are "+ getBase()+""+getHeight()+""+getBase1());
	}
	@Override
	public String tosting() {
		
		return String.format("Shape is "+getShapeName()+"  "+readShapeData()+" Area" + computeArea() +"Perimiter"+computePerimeter() );
	}
	@Override
	public String  getShapeName() {
		
		return "Triangle";
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase1() {
		return base1;
	}
	public void setBase1(double base1) {
		this.base1 = base1;
	}

}
