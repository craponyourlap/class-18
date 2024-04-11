package exercise;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class SetExercises {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ints = makeTreeSet();
		EX3(ints, 100);
		EX4(ints, 100);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < 10; i++) {
			pq.add((int) (Math.random()*10));
		}
		System.out.println("elements in pq: "+pq);
		PriorityQueue<Integer> pq2 = EX5(pq);
	}

	private static PriorityQueue<Integer> EX5(PriorityQueue<Integer> pq) {
		// TODO Auto-generated method stub
//		 Write a Java program to add all the elements which is divisible 
//		 by both 3 and 5 of a priority queue to another priority queue.
		PriorityQueue<Integer> rs = new PriorityQueue<>();
		while (!pq.isEmpty()) {
			Integer i = pq.poll();
			if (i % 5 == 0 && i % 3 == 0) {
				rs.add(i);
			}
		}
		System.out.println("elements in new pq: "+rs);
		return rs;
	}

	private static void EX4(TreeSet<Integer> ints, int i) {
		// TODO Auto-generated method stub
//		Write a Java program to get all the element in a tree set which 
//		is greater than and less than to the given element.
		TreeSet<Integer> fs = new TreeSet<>(ints.subSet(ints.first(), i));
		TreeSet<Integer> ls = new TreeSet<>(ints.subSet(i, ints.last()));
		System.out.println("elements before given element: "+fs);
		System.out.println("elements after given element: "+ls);
	}

	private static void EX3(TreeSet<Integer> ints, int i) {
		// TODO Auto-generated method stub
//		Write a Java program to find the all the numbers which are less 
//		than a given number in a tree set.
		TreeSet<Integer> ts = new TreeSet<>(ints.subSet(ints.first(), i));
		System.out.println(ts);
	}
	

	private static TreeSet<Integer> makeTreeSet() {
		// TODO Auto-generated method stub
		Integer[] array = {23, 44, 45, 46, 55, 100, 102,2222, 100000};
		TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(array));
		return ts;
	}

}
