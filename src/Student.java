import java.util.Comparator;

public class Student {
	int rollno;
	String name, address;
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	static class SortByRoll implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.rollno - o2.rollno;
		}
		
	}
}

