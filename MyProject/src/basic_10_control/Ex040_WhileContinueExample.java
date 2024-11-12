package basic_10_control;
public class Ex040_WhileContinueExample {
	
    public static void main(String[] args) {
    	
        for (int i = 1; i <= 10; i++) {
        	
            if (i == 3) {
                continue;  // i가 3일 때 이후 코드를 건너뜀
            }
            
            System.out.println("i = " + i);
        }
        
    }
    
}
