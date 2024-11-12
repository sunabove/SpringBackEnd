package basic_10_control;
public class Ex008_CompareExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // == (같은 지 비교)
        System.out.println("a == b : " + (a == b));  // false

        // != (다른 지 비교)
        System.out.println("a != b : " + (a != b));  // true

        // > (a가 b보다 큰 지 비교)
        System.out.println("a > b  : " + (a > b));    // false

        // < (a가 b보다 작은 지 비교)
        System.out.println("a < b  : " + (a < b));    // true

        // >= (a가 b보다 크거나 같은 지 비교)
        System.out.println("a >= b : " + (a >= b));  // false

        // <= (a가 b보다 작거나 같은 지 비교)
        System.out.println("a <= b : " + (a <= b));  // true
    }
}
