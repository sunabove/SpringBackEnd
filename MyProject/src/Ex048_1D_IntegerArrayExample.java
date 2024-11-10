public class Ex048_1D_IntegerArrayExample {
    public static void main(String[] args) {
        // 크기가 10인 정수형 배열 선언 및 초기화
        int [] a = new int[10];

        // 배열의 각 요소에 값 할당 (예: 1부터 10까지)
        for (int i = 0; i < a.length; i++) {
            a[i] = i ; 
        }

        // 배열의 값을 출력
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}