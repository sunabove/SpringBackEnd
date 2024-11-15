package basic_40_class.school;

public class StudentPublic extends Person {
	
	// 필드
	public  String studentId; // 어디서나 접근 가능
	
	private String major; // Student 클래스 내부에서만 접근 가능

	// 생성자
	public StudentPublic(String name, int age, String studentId, String major) {
		super(name, age); // 부모 클래스의 생성자 호출
		this.studentId = studentId;
		this.major = major;
	}

	// public 메서드: 어디서나 접근 가능
	public String getMajor() {
		return major;
	}

	// 메인 메서드: 실행 예시
	public static void main(String[] args) {
		StudentPublic student = new StudentPublic("John", 21, "S12345", "Mathematics");

		// public 필드와 메서드에 접근 가능
		System.out.println("학생 ID: " + student.studentId );
		System.out.println("전공: " + student.major );
 
	}
	
}
