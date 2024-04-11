import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> heap = new HashMap<>();
		heap.put(12, "Chaitanya");
		heap.put(2, "Rahul");
		heap.put(7, "Singh");
		heap.put(49, "Ajeet");
		heap.put(3, "Anuj");
		Set set = heap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
//			Map.Entry mentry = iterator.next();
//			it shits itself if u dont typecast to Entry
			System.out.println("key is: " + mentry.getKey() + " & value is: " + mentry.getValue());
		}
		String var = heap.get(2);
		System.out.println("value at index 2 is: "+var);
		heap.remove(3);
		heap.putIfAbsent(103, "Guarav");
		System.out.println("map key and values after removal and adding: ");
		Set set2 = heap.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry)iterator2.next();
			System.out.println("key is: " + mentry2.getKey() + " & value is: " + mentry2.getValue());
		}
	}

}
