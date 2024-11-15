package basic_40_class.school;

public class Student extends Person {
	// 추가적인 필드
	private String studentId ;
	private String major ; 
	//private String name ;
	
	// 생성자
	public Student(String name, int age, String studentId, String major) {
		super(name, age); // 부모 클래스의 생성자 호출
		
		this.studentId = studentId;
		this.major = major;  
	}

	// 학생 ID를 반환하는 메서드
	public String getStudentId() {
		return studentId;
	}

	// 전공을 반환하는 메서드
	public String getMajor() {
		return major;
	}
	
	@Override
	public int getAge() {
		return this.age - 1 ;
	}

	// 메서드 오버라이딩: 정보를 출력하는 메서드 (부모 메서드를 재정의)
	@Override
	public void showInfo() {
		super.showInfo(); // 부모 클래스의 showInfo() 호출
		System.out.println("학생 ID: " + studentId + ", 전공: " + major);
	}
}