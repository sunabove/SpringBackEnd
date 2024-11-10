public class Ex038_ForContinueExample {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            i++;
            if (i == 3) {
                continue;  // i가 3일 때 이후 코드를 건너뜀
            }
            System.out.println("i = " + i);
        }
    }
}
