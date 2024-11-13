package basic_10_control;
public class Ex027_WhileForInfiniteExample2 {
    public static void main(String[] args) {
        int count = 1;

        for( ; 0 == 0 ; ) { // 조건이 항상 true이므로 무한 루프 발생
            System.out.println("Count: " + count);
            count++;
        }
    }
}
