package basic_30_string;
public class Ex110_FactorialExample {

	static long factorial(int n) {
		if (n == 1) { 
			return 1;
		}
		
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		long f = factorial( 20 ) ; 
		
		System.out.println( f ); 
	}
}
