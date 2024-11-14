package basic_30_string;

public class Ex126_PiExample {
	
	public static void main(String[] args) {
		
		double insideCount = 0 ; 
		
		for( int i = 1 ; i < 1000000 ; i ++ ) {
			
			double x = Math.random();
			double y = Math.random();
			
			if( x*x + y*y <=1 ) {
				insideCount += 1 ;
			}
			
			double pi = 4.0*insideCount/i ; 
			
			String text = String.format( "[%,d] Pi = %.6f", i, pi );
			System.out.println( text );
		}
		
	}
}
