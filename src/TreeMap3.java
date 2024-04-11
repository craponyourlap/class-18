import java.util.TreeMap;

public class TreeMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		//maintains descending order
		System.out.println("descendingMap: "+map.descendingMap());

	}

}
