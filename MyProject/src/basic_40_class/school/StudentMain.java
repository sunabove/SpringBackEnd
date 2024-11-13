package basic_40_class.school;

public class StudentMain { 
	
	public static void main(String[] args) {
		// Person 객체 생성
		Person person = new Person("Alice", 30);
		person.showInfo(); 
		// Student 객체 생성
		Student student = new Student("Bob", 20, "S12345", "Computer Science");
		student.showInfo();
	}
}