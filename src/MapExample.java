import java.util.LinkedHashMap;
import java.util.Map;

class Book{
	int id, quantity;
	String name,author,publisher;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", quantity=" + quantity + ", name=" + name + ", author=" + author + ", publisher="
				+ publisher + "]";
	}
	
}
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Book> map = new LinkedHashMap<>();
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Bla Bla Bla","Raiven S." , "Vanier College", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		map.put(2, b2);
		map.put(1, b1);
		map.put(3, b3);
		for (Map.Entry<Integer, Book> entry : map.entrySet()) {
			int key = entry.getKey();
			Book b = entry.getValue();
			System.out.println(key + " details:");
			System.out.println(b);
		}
	}

}
