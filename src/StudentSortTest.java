import java.util.TreeSet;

public class StudentSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> set = new TreeSet<>(new Student.SortByRoll());
		set.add(new Student(1, "raiven", "blainville"));
		set.add(new Student(1, "marco", "vimont"));//it doesnt add because treeset has comparator set to sort by roll
		set.add(new Student(2, "marco", "vimont"));
		System.out.println(set);
	}

}
