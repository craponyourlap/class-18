import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "mango");
		map.put(2, "apple");
		map.put(3, "banana");
		map.put(4, "grape");
		map.put(5, "grape");//duplicate value
		map.put(4, "kiwi");//duplicate key
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
