public class Ex043_10_Multiples {
	
    public static void main(String[] args) {
    	
    	boolean b = true ; 
    	b = false ; 
    	
    	int [] a = new int [9];
    	
    	for( int i = 0 ; i < a.length ; i ++ ) {
    		a[i] = (i + 1)*(11) ; 
    	} 
    	
    	for( int i = 0 ; i < a.length ; i ++ ) {
    		a[i] = i + 1 ; 
    	} 
    	
    	for( int i = 0 ; i < a.length ; i ++ ) {
    		a[i] = a[i] + 10*(i + 1) ; 
    	} 
    	
    	for( int i = 0 ; i < a.length ; i ++ ) {
    		System.out.println( a[i] ) ; 
    	}
    	
    }
    
}
