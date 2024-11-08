
public class Ex001_PrimitiveExample {

	public static void main(String[] args) { 
		byte b = 127 ;
		b = (byte) ( b + 1 ) ;
		System.out.println( "b = " + b ) ;
		
		byte b2 = -128 ;
		b2 = (byte) ( b2 - 1 ) ;
		System.out.println( "b2 = " + b2 ) ;
		
		int i = 1234 ;
		System.out.println( "i = " + i ) ;
		
		long L = 1234L ;
		System.out.println( "L = " + L ) ;
		
		// int i2 = 1234L ; // error 발생 
		// int i2 = 2_147_483_648 ; // error 발생 
		int i2 = 2_147_483_647 ;
		
		System.out.println( "i2 = " + i2 ) ;
	}

}
