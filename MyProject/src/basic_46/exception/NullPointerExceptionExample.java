package basic_46.exception;

public class NullPointerExceptionExample {

	public static void main(String[] args) { 
		
		String str = null;
		
		if( str == null ) { 
			System.out.println( "str은 null 입니다.") ; 
		}
		
		int[] arr = null;
		if( arr == null ) {
			System.out.println( "arr은 null 입니다.") ; 
		} else {
			int num = arr[0]; 
		}
		
	}

}
