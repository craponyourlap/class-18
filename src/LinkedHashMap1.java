import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
