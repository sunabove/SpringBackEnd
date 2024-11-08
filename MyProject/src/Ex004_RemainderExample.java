
public class Ex004_RemainderExample {
	
	public static void main(String [] args) { 
		int result = 10 % 3;  // 결과는 1 (10을 3으로 나누었을 때의 나머지)
		
		System.out.println( "result = " + result ) ; 
		
		int a = 10 % 3;   // a는 1
		int b = -10 % 3;  // b는 -1
		int c = 10 % -3;  // c는 1
		
		System.out.println( "a = " + a ) ;
		System.out.println( "b = " + b ) ;
		System.out.println( "c = " + c ) ;
		
	}
}
