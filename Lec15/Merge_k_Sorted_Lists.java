package Lec15;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode mergeKLists(ListNode[] lists) {

			PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {

				@Override
				public int compare(ListNode o1, ListNode o2) {
					// TODO Auto-generated method stub
					return o1.val - o2.val;
				}
			});
			for (ListNode val : lists) {
				if (val != null) {
					pq.add(val);
				}
			}
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while (!pq.isEmpty()) {
				ListNode rn = pq.poll();
				Dummy.next = rn;
				Dummy = Dummy.next;
				if (rn.next != null) {
					pq.add(rn.next);
				}

			}
			return temp.next;

		}
	}
}
