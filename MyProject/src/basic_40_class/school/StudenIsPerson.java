package basic_40_class.school;

public class StudenIsPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("Alice a", 30); // O
		
		Student p2 = new Student("Bob a", 20, "S12345", "Computer Science"); // O
		
		Person p3 = new Student("Bob b", 22, "S12346", "Computer Science"); // O
		
		// Student p4 = new Person("Alice b", 40); // x
		
	}

}
