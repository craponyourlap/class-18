package exercise;

import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExercises {
	static TreeMap<Integer, String> WAP1() {
//		Write a Java program to create a Tree Map and obtain all keys 
//		from the given a Tree Map.
		System.out.println("WAP1:");
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "aaaaaa");
		tm.put(3, "cccc");
		tm.put(2, "bbbbb");
		for (Entry<Integer, String> e : tm.entrySet()) {
			System.out.println(e.getKey());
		}
		return tm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm = WAP1();
		TreeMap<Integer, String> tm2 = WAP2(tm);
		for (Entry<Integer, String> e : tm.entrySet()) {
			System.out.println(e);
		}
		for (Entry<Integer, String> e : tm2.entrySet()) {
			System.out.println(e);
		}
		WAP3(tm);
		WAP4(tm, 2);
	}
	private static void WAP4(TreeMap<Integer, String> tm, int i) {
		// TODO Auto-generated method stub
//		Write a Java program to display the values of a tree map whose 
//		keys are less than a given key
		System.out.println("WAP4:");
		TreeMap<Integer, String> subtm = new TreeMap<>(tm.subMap(tm.firstKey(), i));
		for (Entry<Integer, String> e : subtm.entrySet()) {
			System.out.println(e);
		}
	}
	private static void WAP3(TreeMap<Integer, String> tm) {
		// TODO Auto-generated method stub
//		Write a Java program to find the greatest key and the least key in 
//		a map.
		System.out.println("WAP3:");
		int min = tm.firstKey();
		System.out.println("smallest key: " + min);
		int max = tm.lastKey();
		System.out.println("biggest key: " + max);
	}
	private static TreeMap<Integer, String> WAP2(TreeMap<Integer, String> tm) {
		// TODO Auto-generated method stub
//		 Write a Java program to copy all of the mappings from the 
//		 specified map to another map.
		System.out.println("WAP2:");
		TreeMap<Integer, String> newmap = new TreeMap<>(tm);
		return newmap;
	}

}
