// 반환형이 int인 함수 예시
package basic_30_string;

public class Ex108_VoidReturnExample {

	// 짝수일 경우 "짝수"를 출력하고 함수 종료, 홀수일 경우 계속 실행
	public static void checkEvenOrOdd(int number) {
		// int number ;
		if (number % 2 == 0) {
			System.out.println("짝수");
			
			return; // 짝수인 경우, 함수 실행 종료
		}

		// 홀수인 경우 실행되는 코드
		System.out.println("홀수");
		
		return ; 
	}

	public static void main(String[] args) {
		checkEvenOrOdd(4); // 짝수 출력 후 함수 종료
		checkEvenOrOdd(7); // 홀수 출력
		checkEvenOrOdd(8); // 홀수 출력
	}
}
