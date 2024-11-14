package basic_30_string;

public class Ex103_StringSplitJoinExample {
    public static void main(String[] args) {
        // split 예제
        String str = "apple,banana,cherry,dragonfruit";
        // 문자열을 콤마(,)로 구분하여 배열로 나눔
        String[] fruits = str.split(",");
        
        System.out.println("split 결과:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // join 예제
        String joinedString = String.join(" - ", fruits);
        System.out.println("\njoin 결과:");
        System.out.println(joinedString);
    }
}
