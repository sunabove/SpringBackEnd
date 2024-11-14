package basic_46.exception;

public class MyExceptionExample {

	// 특정 조건에서 MyException을 던지는 메서드
	public static void checkValue(int value) throws MyException {
		if (value < 0) {
			throw new MyException("음수 값은 허용되지 않습니다: " + value);
		} else {
			System.out.println("값이 유효합니다: " + value);
		}
	}

	public static void main(String[] args) {
		try {
			// 정상적인 값 예시
			checkValue(10);

			// 예외를 발생시키는 값 예시
			checkValue(-5); // 이 줄에서 MyException이 발생
		} catch (MyException e) {
			// 예외 처리
			System.out.println("예외가 발생했습니다: " + e.getMessage());
		}
	}
}
