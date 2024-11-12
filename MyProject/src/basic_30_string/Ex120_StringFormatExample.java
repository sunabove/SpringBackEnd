package basic_30_string;

public class Ex120_StringFormatExample {
    public static void main(String[] args) {
        // 1. 정수 포매팅
        int number = 42;
        String formattedInt = String.format("정수: %d", number);
        System.out.println(formattedInt); // 출력: 정수: 42

        // 2. 소수점 이하 자리수 지정
        double pi = 3.141592;
        String formattedDouble = String.format("Pi: %.2f", pi); // 소수점 이하 2자리까지 표시
        System.out.println(formattedDouble); // 출력: Pi: 3.14

        // 3. 문자열 포매팅
        String name = "Alice";
        String greeting = String.format("안녕하세요, %s님!", name);
        System.out.println(greeting); // 출력: 안녕하세요, Alice님!

        // 4. 자리 맞춤 포매팅
        int value = 123;
        String paddedValue = String.format("'%5d'", value); // 5자리 확보하고 우측 정렬
        System.out.println(paddedValue); // 출력: '  123'

        // 5. 왼쪽 정렬과 오른쪽 정렬
        String leftAligned = String.format("'%-10s'", name);  // 왼쪽 정렬
        System.out.println(leftAligned); // 출력: 'Alice     '

        String rightAligned = String.format("'%10s'", name);  // 오른쪽 정렬
        System.out.println(rightAligned); // 출력: '     Alice'

        // 6. 16진수로 포매팅
        int hexNumber = 255;
        String hexFormatted = String.format("16진수: %x", hexNumber);
        System.out.println(hexFormatted); // 출력: 16진수: ff

        // 7. 퍼센트 표시
        double percentage = 0.857;
        String formattedPercentage = String.format("확률: %.1f%%", percentage * 100); // 퍼센트 기호 사용 시 %%
        System.out.println(formattedPercentage); // 출력: 확률: 85.7%
    }
}
