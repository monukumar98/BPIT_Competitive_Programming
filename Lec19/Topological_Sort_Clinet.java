package Lec19;

import java.util.Arrays;

public class Topological_Sort_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Topological_Sort t = new Topological_Sort(7);
		t.addEdge(1, 2);
		//t.addEdge(2, 1);
		t.addEdge(1, 4);
		t.addEdge(2, 3);
		t.addEdge(3, 6);
		t.addEdge(1, 2);
		t.addEdge(4, 3);
		t.addEdge(4, 6);
		t.addEdge(4, 5);
		t.addEdge(5, 7);
		t.addEdge(5, 6);
		t.addEdge(7, 6);
		System.out.println(Arrays.toString(t.indegree()));
		t.TopologicalSort();
		System.out.println(t.IsCycle());

	}

}
