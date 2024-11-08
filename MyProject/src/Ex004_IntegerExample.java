public class Ex004_IntegerExample {
    public static void main(String[] args) {
        byte byteValue = 100;           // 1바이트 정수
        short shortValue = 30000;       // 2바이트 정수
        int intValue = 200000;          // 4바이트 정수 (기본 정수형)
        long longValue = 10000000000L;  // 8바이트 정수, 값 뒤에 'L'을 붙임

        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
    }
}
