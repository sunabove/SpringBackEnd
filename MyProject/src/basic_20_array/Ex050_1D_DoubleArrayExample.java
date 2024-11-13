package basic_20_array;
public class Ex050_1D_DoubleArrayExample {
    public static void main(String[] args) {
        // 실수형 배열 선언 및 초기화
        double [] d = { 1.5, 2.8, 3.3, 4.7, 5.0 };

        // 배열의 값 출력
        for (int i = 0; i < d.length; i++) {
            System.out.println("numbers[" + i + "] = " + d[i]);
        }
    }
}
