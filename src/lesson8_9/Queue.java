package lesson8_9;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Queue {
	Object [] a;
	int front=0;
	int rear=0;
	int size=0;
	 Queue(int len){
		 
		 a= new Object[len];
	 }

	 public void add(Object i){
		 if(a.length==0){
			 throw new IllegalStateException("Cannot add to full queue");
			 }
		 else if(rear>=a.length-1){
			 System.out.println("you cant add error");
		 }
		 else{
		 a[rear]=i;
		 ++rear;
		  size++;}
	 }
	 
	 public Object remove(){
		 if(a.length==0){
			 throw new NoSuchElementException("Cannot remove from empty queue");
		 }
		 Object item= a[front];
		 a[front]=null;
		 front++;
		 size--;
		 return  item;
		 
	 }
	 public Object peek(){
		 if(a.length==0){
			 throw new NoSuchElementException("Cannot remove from empty queue");
			 }
		 
		 else
		 return a[front];
		 
	 }
public int size(){
	
		 return size;
	 }
public boolean isEmpty(){
	return size==0;
}
public String  toString(){
	 return String.format(Arrays.toString(a)+"Front element "+peek() +" Content of Array "+isEmpty()+" Array length "+size()+" \nThe Element  removed  "+remove());
}

public static void main(String[] args) {
	Queue list =new Queue(4);
	list.add("lwam");
	list.add(4);
	list.add(2);
System.out.println(list);
list.add(7);
System.out.println(list);
System.out.println(list.remove());
list.add(5);
//System.out.println(list.remove());
//System.out.println(list);

	}
}
