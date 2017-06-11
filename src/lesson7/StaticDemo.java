package lesson7;

public class StaticDemo {
static int data=30; int data1 = 100;
void print()
{
System.out.println("data is "+data1); }
static class Inner{ static int x=50; static void msg()
{System.out.println("data is "+x); 
System.out.println("data is "+data);
}
// System.out.println("data is "+data1); //Error }
void display()
{
System.out.println("Static Method Demo");
} }
public static void main(String[] args) { 
	new StaticDemo().print();
	Inner.msg();
	new Inner().display();}
}
