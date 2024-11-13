package basic_20_array;
public class Ex051_PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;

        for (int num = 2; count < 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num/2 ; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
            	count ++ ; 
                System.out.print( num + ", " ); 
                
                if (count % 10 == 0) { // 10개씩 줄 바꿈
                    System.out.println();
                }
            }
        }
    }
}
