package Lec15;

import java.util.*;

public class Heap {
	private ArrayList<Integer> list = new ArrayList<>();

	public void add(int item) {
		this.list.add(item);
		upheapfy(list.size() - 1);

	}

	public int remove() {
		swap(0, this.list.size() - 1);
		int val = list.remove(list.size() - 1);
		downheapfy(0);
		return val;

	}

	private void downheapfy(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < list.size() && list.get(mini) > list.get(lci)) {
			mini = lci;
		}
		if (rci < list.size() && list.get(mini) > list.get(rci)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapfy(mini);
		}

	}

	private void upheapfy(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (list.get(pi) > list.get(ci)) {
			swap(pi, ci);
			upheapfy(pi);
		}

	}

	private void swap(int pi, int ci) {

		int pith = list.get(pi);
		int cith = list.get(ci);
		list.set(pi, cith);
		list.set(ci, pith);

	}

	public int get() {
		return list.get(0);
	}

	public void Display() {
		System.out.println(list);
	}

	public static void main(String[] args) {
		Heap pq = new Heap();
		pq.add(10);
		pq.add(-10);
		pq.add(7);
		pq.add(6);
		pq.add(2);
		pq.add(1);
		pq.add(5);
		pq.add(3);
		pq.add(7);
		pq.Display();
		System.out.println(pq.remove());
		pq.Display();
		

	}
	
}
