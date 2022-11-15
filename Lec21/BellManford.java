package Lec21;

import java.util.*;

public class BellManford {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellManford(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);// v1 se v2 ko connect kiya hai
	}

	public class EdgeList {
		int e1;
		int e2;
		int cost;

		public EdgeList(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}
	}

	public List<EdgeList> AllEdgelist() {
		List<EdgeList> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				ll.add(new EdgeList(e1, e2, map.get(e1).get(e2)));
			}
		}
		return ll;

	}

	public void BellManfordAlgo() {
		List<EdgeList> ll = AllEdgelist();
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 2; i < dis.length; i++) {
			dis[i] = 10000000;

		}
		for (int i = 1; i <= v; i++) {
			for (EdgeList edge : ll) {

				if (i == v) {
					if (dis[edge.e2] > dis[edge.e1] + edge.cost) {
						System.out.println("-ve Cycle h");
						return;
					}
				}
				if (dis[edge.e2] > dis[edge.e1] + edge.cost) {
					dis[edge.e2] = dis[edge.e1] + edge.cost;
				}
			}

		}
		for (int i = 1; i < dis.length; i++) {
			System.out.print(dis[i] + " ");

		}

	}

	public static void main(String[] args) {
		BellManford bfd = new BellManford(5);
		bfd.AddEdge(1, 2, 8);
		bfd.AddEdge(2, 5, -2);
		//bfd.AddEdge(2, 5, 2);
		bfd.AddEdge(5, 2, -1);
		bfd.AddEdge(4, 5, 4);
		bfd.AddEdge(3, 4, -3);
		bfd.AddEdge(1, 3, 4);
		bfd.AddEdge(1, 4, 5);
		bfd.BellManfordAlgo();
	}

}
