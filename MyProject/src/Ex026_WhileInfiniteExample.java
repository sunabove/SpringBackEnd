public class Ex026_WhileInfiniteExample {
    public static void main(String[] args) {
        int count = 1;

        while (true) { // 조건이 항상 true이므로 무한 루프 발생
            System.out.println("Count: " + count);
            count++;
        }
    }
}
