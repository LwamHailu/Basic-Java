package lesson10;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
// Demo code for the user implemenation of Binary search tree
public class MyBST {
	
			
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}
	
	/**
	* Prints the values in the nodes of the tree
	* in sorted order. Inorder Traversal
	*/
	public void printTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTree(root);
	}
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree( BinaryNode t ){
		if(t != null){
			printTree( t.left );
		    System.out.print(t.element+",");
		    printTree( t.right );
		} 
	}
	
	/**
	* Prints the values in the nodes of the tree
	* in preOrder order. preOrder Traversal
	*/
	public void printpreOrderTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printpreOrderTree(root);
	}
	// preOrder Traversal to print the nodes
	private void printpreOrderTree( BinaryNode t ){
		if(t != null){
			System.out.print(t.element+",");
			printpreOrderTree( t.left );
			printpreOrderTree( t.right );
		} 
	}
		 
	/**
	* Prints the values in the nodes of the tree
	* in postOrder order. postOrder Traversal
	*/
	public void printpostOrderTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printpostOrderTree(root);
	}
	// preOrder Traversal to print the nodes
	private void printpostOrderTree( BinaryNode t ){
		if(t != null){
			
			printpostOrderTree( t.left );
			printpostOrderTree( t.right );
			System.out.print(t.element+",");
		} 
	}
		
	
	//Assume the data in the Node is an Integer.	

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		}
		else { 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted)//true
				{
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
					n.right = new BinaryNode(x,null,null);
					inserted = true;
					}
						//keep looking for a place to insert (a null)
					else {
							n = n.right;
					}
										
				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left;      // Left child
		private BinaryNode right;     // Right child	  
		// Constructors 
		
		BinaryNode( Integer theElement ){
			this( theElement, null, null );
		}	

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
			this.element = element;
			this.left = left;
			this.right = right;
		}
		
	}
		
	//Binary node
	public BinaryNode getRoot(){
		return root;
	}

	//Check if integer is contained
		public boolean contains(Integer key){
			if( root == null )
				return false;
			else{
				boolean isfound = false;
				BinaryNode t = root;
				while(!isfound){
					if(t.element == key){
						isfound = true;
					}else if(t.element < key){
						t = t.right;
					}else{
						t = t.left;
					}
				}
				return isfound;
			}
			
		}
		
		public int leafNodes(){
			if(root==null){
				return 0;
			}else{
				return leafNodes(root);
			}
			
		}
		
		public int leafNodes(BinaryNode t){
		
			if(t==null){
				return 0;
			}else if(t.left==null && t.right==null){
				return 1;
			}else{
				return leafNodes(t.left) + leafNodes(t.right);
			}
			
		}
		
		public int size(){
			if(root==null){
				return 0;
			}else{
				return size(root);
			}
		}
		public boolean isEmpty(){
			if(root.element==null){
				return true;
			}else{
				return false;
			}
		}
		private int size(BinaryNode t){
			if(t==null){
				return 0;
			}else if(t.element != null){
				int count = 0;
				count ++;
				return count  + (size(t.left) + size(t.right));
			}else{
				return 0;
			}
		}
		
	public static void main(String[] args) {
		
		MyBST mybst = new MyBST();
		
		int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
	
		for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);
		}
		
		mybst.insert(12);
		System.out.println("\n\nInorder Traverse print;");
		mybst.printTree();
		System.out.println("\n\nPreorder Traverse print;");
		mybst.printpreOrderTree();
		System.out.println("\n\nPostorder Traverse print;");
		mybst.printpostOrderTree();
		System.out.println();
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		for (int j = 0; j < a.length; j++ ) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();		
			Integer nextItem = null;
			while(it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			} 
			System.out.println();
		}
		
		System.out.println("\nBinary Set Tree contains 12; "+ mybst.contains(12));
		System.out.println("Root Element: "+mybst.getRoot().element);
		System.out.println("Leaf Nodes: "+mybst.leafNodes());
		System.out.println("Size: "+mybst.size());
		
		if(mybst.isEmpty()){
			System.out.println("The BST is empty");
		}else{
			System.out.println("The BST is not empty");
		}
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "MY");
		map.put(10, "Beutiful");
		map.put(11, "Home");
		map.remove(8);
		String str = map.get(11)+", "+ map.get(10);
		System.out.println(str);
	}
}

