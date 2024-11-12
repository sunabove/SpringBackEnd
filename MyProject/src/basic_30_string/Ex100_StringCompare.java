package basic_30_string;
public class Ex100_StringCompare {
    public static void main(String[] args) { 
    	
    	{
    		String str1 = "HelloA";
    		String str2 = "Hello";
    		boolean isEqual = str1.equals(str2);  // 결과: true
    		
    		System.out.println( "isEqual = " + isEqual ) ; 
    	}
    	
    	{
    		String str1 = "HelloA";
    		String str2 = "Hello";
    		String str3 = new String("Hello");
    		boolean isSame1 = (str1 == str2);  // 결과: true (같은 리터럴 객체 참조)
    		boolean isSame2 = (str1 == str3);  // 결과: false (다른 객체 참조)
    		
    		System.out.println( "isSame1 = " + isSame1 ) ;
    		System.out.println( "isSame2 = " + isSame2 ) ;
    	}
    	
    	{
    		String str1 = "Hello";
    		String str2 = "Hello";
    		int result = str1.compareTo( str2 );  // 결과: 0 (같은 문자열)
    		
    		System.out.println( "result = " + result ) ;
    	}
    }
}