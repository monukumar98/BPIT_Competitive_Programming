package Lec21;

import java.util.*;

public class Dijkstra_Algo {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public class DijkstraPair {
		int vtx;
		String acqp;
		int cost;

		public DijkstraPair(int vtx, String acqp, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.cost = cost;
			this.acqp = acqp;
		}

		@Override
		public String toString() {
			return this.vtx + " " + this.acqp + " @ " + this.cost;
		}

	}

	public void Dijkstra() {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		Set<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(1, "1", 0));

		while (!pq.isEmpty()) {
			DijkstraPair rp = pq.remove();
			if (visited.contains(rp.vtx)) {
				continue;
			}

			System.out.println(rp);
			visited.add(rp.vtx);
			for (int key : map.get(rp.vtx).keySet()) {
				if (!visited.contains(key)) {
					int edgeCost = rp.cost + map.get(rp.vtx).get(key);
					pq.add(new DijkstraPair(key, rp.acqp + key, edgeCost));
				}
			}

		}

	}

	public static void main(String[] args) {
		Dijkstra_Algo pa = new Dijkstra_Algo(7);
		pa.AddEdge(1, 2, 10);
		pa.AddEdge(2, 3, 4);
		pa.AddEdge(1, 4, 1);
		pa.AddEdge(4, 5, 8);
		pa.AddEdge(3, 4, 2);
		pa.AddEdge(5, 6, 7);
		pa.AddEdge(5, 7, 9);
		pa.AddEdge(6, 7, 1);
		pa.Dijkstra();
	}
}
