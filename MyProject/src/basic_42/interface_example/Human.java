package basic_42.interface_example;

//Human 인터페이스 정의 - 공통적인 특성을 정의
interface Human {
	// 이름을 반환하는 메소드
	String getName();

	// 나이를 반환하는 메소드
	int getAge();
}

//Person 클래스 - Human 인터페이스 구현
class Person implements Human {
	protected String name;
	protected int age;

	// Person 클래스의 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Human 인터페이스의 메소드를 구현
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}
}

//Student 클래스 - Human 인터페이스 구현, Person과 다른 특성 추가
class Student implements Human {
	private String name;
	private int age;
	private String studentId;

	// Student 클래스의 생성자
	public Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}

	// Human 인터페이스의 메소드를 구현
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	// Student 클래스 고유의 메소드
	public String getStudentId() {
		return studentId;
	}
}

