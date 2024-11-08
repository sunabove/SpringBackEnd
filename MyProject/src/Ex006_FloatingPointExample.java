public class Ex006_FloatingPointExample {
    public static void main(String[] args) {
        // float 타입 변수 선언 및 초기화
        float f1 = 3.14F;          // 값 뒤에 F를 붙여야 함
        float f2 = 1.23e2F; // 지수 표기법 사용 (1.23 * 10^2)

        // double 타입 변수 선언 및 초기화
        double d1 = 3.141592653589793;
        double d2 = 1.23e2; // 지수 표기법 사용 (1.23 * 10^2)
        double d3 = .0 ;
        double d4 = .0 ;
        double d5 = .01 ;
        double d6 = .010000000 ;

        // 값 출력
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);        
        System.out.println("d3: " + d3);
        System.out.println("d4: " + d4);
        System.out.println("d5: " + d5);
        System.out.println("d6: " + d6);
    }
}
