package basic_40_class.school;

public class StudentPublicMain { 
	
	public static void main(String[] args) {
		StudentPublic student = new StudentPublic("John", 21, "S12345", "Mathematics");

		// public 필드와 메서드에 접근 가능
		System.out.println("학생 ID: " + student.studentId);
		System.out.println("전공: " + student.getMajor()); 
		// System.out.println("전공: " + student.major ); // 에러 발생
	}
	
}
