import java.util.TreeMap;

public class GFG {
	static void Example2ndConstructor(){
		TreeMap<Student, Integer> treemap = new TreeMap<>(new Student.SortByRoll());
		treemap.put(new Student(111, "bbbb", "london"), 2);
		treemap.put(new Student(131, "aaaa", "nyc"), 3);
		treemap.put(new Student(121, "cccc", "jaipur"), 1);
		System.out.println("TreeMap: " + treemap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TreeMap using TreeMap(Comparator) constructor");
		Example2ndConstructor();
	}

}
