package basic_46.exception;

//사용자 정의 예외 클래스
public class MyException extends Exception {
	
	// 기본 생성자
	public MyException() {
		super( "MyException이 발생했습니다!" );
	}

	// 예외 메시지를 받는 생성자
	public MyException(String message) {
		super(message);
	}
	
}
