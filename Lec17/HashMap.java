package Lec17;

import java.util.*;

public class HashMap<K, V> {

	private class Node {
		K key;
		V value;
		Node next;
	}

	private ArrayList<Node> list;
	private int size = 0;

	public HashMap(int cap) {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
		for (int i = 0; i < cap; i++) {
			list.add(null);

		}
	}

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);

	}

	public void put(K key, V value) {
		int bn = hashfun(key);
		Node temp = list.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		temp = list.get(bn);
		Node node = new Node();
		node.key = key;
		node.value = value;
		node.next = temp;
		list.set(bn, node);
		size++;
		double thf = 2.0;
		double lfa = (1.0 * size) / list.size();
		if (lfa > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> nba = new ArrayList<>();
		for (int i = 0; i < 2 * list.size(); i++) {
			nba.add(null);
		}
		ArrayList<Node> oba = list;
		size = 0;
		list = nba;
		for (Node node : oba) {
			while (node != null) {
				put(node.key, node.value);
				node = node.next;
			}
		}

	}

	public V get(K key) {
		int bn = hashfun(key);
		Node temp = list.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;

	}

	public boolean containsKey(K key) {
		int bn = hashfun(key);
		Node temp = list.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V remove(K key) {
		int bn = hashfun(key);
		Node curr = list.get(bn);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		}
		size--;
		if (prev == null) {
			list.set(bn, curr.next);
		} else {
			prev.next = curr.next;
		}
		curr.next = null;
		return curr.value;

	}

	public int hashfun(K key) {
		int bn = key.hashCode() % list.size();
		if (bn < 0) {
			bn += list.size();
		}

		return bn;

	}

	@Override
	public String toString() {
		String s = "{";
		for (Node node : list) {
			while (node != null) {
				s = s + node.key + "=" + node.value + " ";
				node = node.next;
			}
		}
		return s + "}";

	}

}
