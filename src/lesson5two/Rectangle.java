package lesson5two;

public class Rectangle extends Shape {
	private double width;
	private double height;
		public Rectangle(double width,double height) {
			this.width=width;
			this.height=height;
			}
public Rectangle() {
			// TODO Auto-generated constructor stub
		}
public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double computeArea() {
		
		return width*height;
	}
	@Override
	public double computePerimeter() {
		
		return 2*(width*height);
	}
	@Override
	public String readShapeData() {
		
		return String.format("Height "+getHeight() +" width "+ getWidth());
	}
	@Override
	public String tosting() {
		
		return String.format("Perimeter "+computePerimeter()+" Area"+computeArea()+" The shape "+getShapeName()+" "+readShapeData()) ;
	}
	@Override
	public String getShapeName() {
		
		return "rectangle";
	}

}
