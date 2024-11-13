package basic_30_string;

import java.text.DecimalFormat;

public class Ex122_DecimalFormatExample {
    public static void main(String[] args) {
        // 1. 기본 형식 지정
        DecimalFormat df = new DecimalFormat("#.###");
        double pi = 3.141592;
        System.out.println("소수점 이하 두 자리: " + df.format(pi));  // 출력: 소수점 이하 두 자리: 3.14

        // 2. 천 단위 구분기호 추가
        DecimalFormat dfWithComma = new DecimalFormat("#,###");
        int largeNumber = 1234567;
        System.out.println("천 단위 구분: " + dfWithComma.format(largeNumber));  // 출력: 천 단위 구분: 1,234,567

        // 3. 소수점 이하 자릿수 고정 (부족한 자리는 0으로 채움)
        DecimalFormat dfFixedDecimal = new DecimalFormat("#.000");
        double smallNumber = 12.3;
        System.out.println("소수점 이하 세 자리 (고정): " + dfFixedDecimal.format(smallNumber));  // 출력: 소수점 이하 세 자리 (고정): 12.300

        // 4. 양수와 음수 형식 지정
        DecimalFormat dfPositiveNegative = new DecimalFormat("+#,###; -#,###");
        int positiveNum = 1234;
        int negativeNum = -1234;
        System.out.println("양수 형식: " + dfPositiveNegative.format(positiveNum));  // 출력: 양수 형식: +1,234
        System.out.println("음수 형식: " + dfPositiveNegative.format(negativeNum));  // 출력: 음수 형식: -1,234

        // 5. 퍼센트 포매팅
        DecimalFormat dfPercentage = new DecimalFormat("#.##%");
        double rate = 0.856;
        System.out.println("퍼센트 형식: " + dfPercentage.format(rate));  // 출력: 퍼센트 형식: 85.6%

        // 6. 0으로 자리 채우기
        DecimalFormat dfWithLeadingZeros = new DecimalFormat("00000");
        int numWithLeadingZeros = 42;
        System.out.println("0으로 자리 채우기: " + dfWithLeadingZeros.format(numWithLeadingZeros));  // 출력: 0으로 자리 채우기: 00042
    }
}
