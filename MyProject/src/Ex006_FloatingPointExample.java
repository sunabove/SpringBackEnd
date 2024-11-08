public class Ex006_FloatingPointExample {
    public static void main(String[] args) {
        // float 타입 변수 선언 및 초기화
        float floatNumber = 3.14F;          // 값 뒤에 F를 붙여야 함
        float anotherFloatNumber = 1.23e2F; // 지수 표기법 사용 (1.23 * 10^2)

        // double 타입 변수 선언 및 초기화
        double doubleNumber = 3.141592653589793;
        double anotherDoubleNumber = 1.23e2; // 지수 표기법 사용 (1.23 * 10^2)

        // 값 출력
        System.out.println("float: " + floatNumber);
        System.out.println("another float: " + anotherFloatNumber);
        System.out.println("double: " + doubleNumber);
        System.out.println("another double: " + anotherDoubleNumber);
    }
}
