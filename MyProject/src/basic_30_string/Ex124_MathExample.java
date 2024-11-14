package basic_30_string;

public class Ex124_MathExample {
	public static void main(String[] args) {
		// 1. 절댓값
		int a = -5;
		System.out.println("abs(" + a + ") = " + Math.abs(a)); // 결과: 5

		// 2. 최대값과 최소값
		int x = 10, y = 20;
		System.out.println("max(" + x + ", " + y + ") = " + Math.max(x, y)); // 결과: 20
		System.out.println("min(" + x + ", " + y + ") = " + Math.min(x, y)); // 결과: 10

		// 3. 거듭제곱과 제곱근
		double base = 2, exponent = 3;
		System.out.println("pow(" + base + ", " + exponent + ") = " + Math.pow(base, exponent)); // 결과: 8.0
		double number = 16;
		System.out.println("sqrt(" + number + ") = " + Math.sqrt(number)); // 결과: 4.0

		// 4. 삼각 함수
		double angle = Math.toRadians(45); // 45도 -> 라디안
		System.out.println("sin(45도) = " + Math.sin(angle)); // 결과: 약 0.7071
		System.out.println("cos(45도) = " + Math.cos(angle)); // 결과: 약 0.7071
		System.out.println("tan(45도) = " + Math.tan(angle)); // 결과: 약 1.0

		// 5. 로그 및 지수 함수
		double value = 10;
		System.out.println("log(" + value + ") = " + Math.log(value)); // 자연 로그, 결과: 약 2.3025
		System.out.println("log10(" + value + ") = " + Math.log10(value)); // 밑이 10인 로그, 결과: 1.0
		System.out.println("exp(2) = " + Math.exp(2)); // e^2, 결과: 약 7.389

		// 6. 반올림 함수
		double number1 = 5.3, number2 = 5.7;
		System.out.println("round(" + number1 + ") = " + Math.round(number1)); // 결과: 5
		System.out.println("round(" + number2 + ") = " + Math.round(number2)); // 결과: 6
		System.out.println("ceil(" + number1 + ") = " + Math.ceil(number1)); // 결과: 6.0
		System.out.println("floor(" + number1 + ") = " + Math.floor(number1)); // 결과: 5.0
		
		// 7. 난수 생성
		System.out.println("random() = " + Math.random()); // 0.0 이상 1.0 미만의 난수 출력
		
		double d = 1.6 ;
		
		double d2 = (int) d ;
		double d3 = (int) ( d + 0.5 ) ; 
		
		System.out.println( "d2 = " + d2 ) ;
		System.out.println( "d3 = " + d3 ) ;
		
	}
}
