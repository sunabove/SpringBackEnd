package basic_30_string;
public class Ex102_EscapeCharacterExample {
    public static void main(String[] args) {
        // 줄바꿈과 탭 사용
        String message = "Hello, \n\tWelcome to the Java World!";

        // 큰따옴표와 작은따옴표 사용
        String quote = "She said, \"Java programming is fun!\"";
        String singleQuote = "It\'s a sunny day. aaa";

        // 역슬래시 사용
        String filePath = "C:\\Program Files\\JavaABC\b"; 

        // 결과 출력
        System.out.println( message );
        System.out.println( quote );
        System.out.println( singleQuote );
        System.out.println( filePath );
    }
}
