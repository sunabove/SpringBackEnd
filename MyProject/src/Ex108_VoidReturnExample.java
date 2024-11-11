// 반환형이 int인 함수 예시
public class Ex108_VoidReturnExample {

    // 두 정수를 더하는 함수
    public static int add(int a, int b) {
        return a + b;  // 두 수의 합을 반환
    }

    public static void main(String[] args) {
        int result = add(5, 10);  // add 함수 호출
        System.out.println("합: " + result);  // 출력: 합: 15
    }
}

