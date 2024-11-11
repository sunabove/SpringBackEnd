public class Ex028_WhileInfiniteBreakExample {
    public static void main(String[] args) {
        int count = 1;

        while (true) {  // 조건이 항상 true이므로 무한 루프 발생
            System.out.println("Count: " + count);
            count++;

            // 특정 조건에서 루프를 탈출
            if (count > 10) { 
                break;  // 루프를 종료하는 명령어
            }
        }
    }
}
