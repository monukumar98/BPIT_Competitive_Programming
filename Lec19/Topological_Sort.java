package Lec19;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort {

	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Topological_Sort(int v) {
		// TODO Auto-generated constructor stub
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2) {
		map.get(v1).put(v2, 0);

	}

	public void TopologicalSort() {
		int[] in = indegree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		while (!q.isEmpty()) {
			int rv = q.poll();
			System.out.print(rv + " ");
			for (int nbrs : map.get(rv).keySet()) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		System.out.println();

	}

	public boolean IsCycle() {
		int[] in = indegree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		int count = 0;
		while (!q.isEmpty()) {
			int rv = q.poll();
			// System.out.print(rv + " ");
			count++;
			for (int nbrs : map.get(rv).keySet()) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		return count != map.size();

	}

	public int[] indegree() {
		int[] in = new int[map.size() + 1];
		for (int key : map.keySet()) {
			for (int nbrs : map.get(key).keySet()) {
				in[nbrs]++;
			}

		}
		return in;
	}

}
