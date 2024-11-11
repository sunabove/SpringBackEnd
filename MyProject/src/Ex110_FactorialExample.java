public class Ex110_FactorialExample {

	static long factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println( factorial(20) ); // 출력: 합: 15
	}
}
