package Lec15;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Vector;

public class Heap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PriorityQueue<Integer> pq = new PriorityQueue<>();
		//PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(10);
		pq.add(-10);
		pq.add(7);
		pq.add(6);
		pq.add(2);
		pq.add(1);
		pq.add(5);
		pq.add(3);
		pq.add(7);
		System.out.println(pq);
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(-5);
		v.add(7);
		System.out.println(v);

	}

}
