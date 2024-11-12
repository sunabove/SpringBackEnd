package basic_30_string;
public class Ex105_TypeConversionExample {
	
	public static void main(String[] args) { 
		
		int i = 1 ;
		double d = i ;
		
		System.out.println( "d = " + d );
		
		double x = 9.7;
		// double -> int 강제 형 변환
		int y = (int) x ;
		System.out.println( "y = " + y ); 
	}
	
}