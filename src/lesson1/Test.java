package lesson1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(6);
		list.add(2);
		list.add(5);
		
		list.add(3);
		list.remove(1);
		//list.remove(3);
		//list.add(1, 3);
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			}
	System.out.println(list.size());
//		Queue<Integer> q = new LinkedList<Integer>(); 
//		q.add(42);
//		q.add(-3);
//		q.add(17); 
//		System.out.println(q);
//		
//		System.out.println(q.peek());
	Queue<Integer> pq = new PriorityQueue<Integer>(); 
	pq.add(25);
	pq.add(15);
	pq.add(35);
	System.out.println("Priority Queue Elements : " + pq);

	}

}
