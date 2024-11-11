public class Ex034_ForBreakExample {
	
    public static void main(String[] args) {
    	
        for( int i = 1; i <= 10; i++ ) {
        	if ( true ) break ; 
        	
            if( i == 5 ) {
                break ;  // i가 5일 때 반복문을 종료
            }
            
            System.out.println("i: " + i);
        }
        
        System.out.println("Loop exited.");
        System.out.println("Loop exited 2.");
    }
}