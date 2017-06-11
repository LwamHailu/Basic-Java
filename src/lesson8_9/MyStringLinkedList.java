package lesson8_9;

public class MyStringLinkedList {
	Node header;
	int Size=0;

	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
		    	header.previous = n;
		    	header = n;
		}
		Size++;
	}

// Implement the cod

	public void addLast(String item) {
		if(isEmpty()){
			header = new Node(null, item, null);
		}
		else{
		Node temp=header;
		while(temp.next!=null){
			temp=temp.next;
		}
		Node newNode=new Node(temp,item,null);
		temp.next=newNode;
		temp=newNode;
		//System.out.println(newNode);
		}
		Size++;
	}


	// implement the code
	public void postAddNode(Node n, String value){
			if(n==null){
				header=new Node(null,value,null);
				}
			else if(n.next==null){
				addLast(value);
				return;
			}
			{
				
				Node newNode= new Node(n,value,n.next);
				n.next.previous=newNode;
				n.next=newNode;
				
				
			}
			Size++;		
	}
// implement the code

       public int Size(){
    	   return Size;
       }

// implement code
    public boolean isEmpty()
{
    	return Size==0;
}  

 

 public void preAddNode(Node n, String value){
		Node newNode;
		if (n == null){
			//List is empty
			newNode = new Node(null, value, null);
		}
		else if (n.previous == null) {
			//n is the first node
			addFront(value);
		}
		else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}	
					
	}
	
	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null){
				temp = temp.next;
				}
			return temp;
		}
		
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			
		}
		return null;
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}

		}

	}
	
	public void deleteList(){
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str.toString();
	}
	public void removeFirst(){
		
		if(header==null){
			throw new RuntimeException("Empty Linked List");
		}
		else{
			header.next.previous=null;
			header=header.next;
			Size--;
		}
	}
	public void removelast(){
		if(header==null){
			throw new RuntimeException("Empty Linked List");
		}
		else{
		 Node temp=header;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.previous.next=null;
		Size--;
		}
	}
	public Object getFirstObject(){
		if(header==null){
			throw new RuntimeException("Empty Linked List");
		}
		return header;
			
		}
		
	
	public Object getLastObject(){
		if(header==null){
				throw new RuntimeException("Empty Linked List");
			}
	Node temp=header;
	while(temp.next!=null){
		temp=temp.next;
	}
		return temp;
	}
	public void printReverse() {
		String str =""; 
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str.toString());
	}
	
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
		
		}
		
	

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Carrot Cake");
		System.out.println(mySL.Size());
		mySL.printReverse();
		mySL.addFront("Blueberry Muffin");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Apple Pie");
		System.out.println(mySL);
//		mySL.printReverse();
	    mySL.addLast("Orange Juice");
	    System.out.println(mySL);
//		mySL.printReverse();
//		mySL.addLast("Peach Sauce");
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.deleteNode(mySL.findItem("Apple Pie"));
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.deleteNode(mySL.findItem("Peach Sauce"));
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.deleteNode(mySL.findItem("Carrot Cake"));
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie" );
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight" );
//     	System.out.println(mySL);
//	   mySL.printReverse();
//	   mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie" );
//       System.out.println(mySL);
//     	mySL.printReverse();
//		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce" );
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.deleteList();		
//		System.out.println(mySL);
//		mySL.printReverse();
	}

}