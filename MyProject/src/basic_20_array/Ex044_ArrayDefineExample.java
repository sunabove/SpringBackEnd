package basic_20_array;
public class Ex044_ArrayDefineExample {
	
    public static void main(String[] args) { 
        
        // 배열 선언
    	int[] numbers ; // 또는 int numbers[];
    	// 배열 초기화
    	numbers = new int[5] ;  // 크기가 5인 정수형 배열 생성 
    	
    	for( int i = 0 ; i < numbers.length ; i ++ ) {
    		numbers[i] = i ; 
    	} 

        // 배열의 첫 번째 요소에 접근
        System.out.println( numbers[0] ); // 1
        // 배열의 두 번째 요소에 접근
        System.out.println( numbers[1] ); // 2
        // 배열의 마지막 요소에 접근
        System.out.println( numbers[4] ); // 5
    }
    
}
