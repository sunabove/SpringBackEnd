public class Ex041_ForBreakContnueExample {
    public static void main(String[] args) {
        // 1부터 10까지 반복
        for (int i = 1; i <= 10; i++) {
            // i가 5일 때는 반복을 건너뛰고 다음 반복으로 넘어감
            if (i == 5) {
                System.out.println("Skipping " + i);
                continue;  // 현재 반복을 건너뛰고 다음 반복으로
            }
            // i가 8일 때는 반복문을 종료
            if (i == 8) {
                System.out.println("Exiting loop at " + i);
                break;  // 반복문을 종료
            }

            // i가 5도 아니고 8도 아닌 경우 출력
            System.out.println("i = " + i);
        }
    }
}