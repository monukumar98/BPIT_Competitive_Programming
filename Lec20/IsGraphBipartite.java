package Lec20;

import java.util.*;

public class IsGraphBipartite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] graph = { { 1, 2, 3 }, { 0, 2 }, { 0, 1, 3 }, { 0, 2 } };
		System.out.println(isBipartite(graph));

	}

	static class BipartitePair {
		int vtx;
		int lv;

		public BipartitePair(int vtx, int lv) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.lv = lv;

		}
	}

	public static boolean isBipartite(int[][] graph) {

		Queue<BipartitePair> q = new LinkedList<>();
		HashMap<Integer, Integer> visited = new HashMap<>();

		for (int src = 0; src < graph.length; src++) {
			if (visited.containsKey(src)) {
				continue;
			}
			q.add(new BipartitePair(src, 0));
			while (!q.isEmpty()) {
				// 1.remove
				BipartitePair rv = q.remove();
				// 2 .Ignore
				if (visited.containsKey(rv.vtx) && visited.get(rv.vtx) != rv.lv) {
					return false;
				}

				// 4 visited marked
				visited.put(rv.vtx, rv.lv);
				// 5 nbrs ko add krna
				for (int j = 0; j < graph[rv.vtx].length; j++) {
					int nbrs = graph[rv.vtx][j];
					if (!visited.containsKey(nbrs)) {
						q.add(new BipartitePair(nbrs, rv.lv + 1));
					}
				}

			}

		}
		return true;

	}

}
