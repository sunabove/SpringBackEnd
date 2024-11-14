package basic_46.exception;

public class NullPointerExceptionExample {

	public static void main(String[] args) { 
		
		String str = null;
		str.length();  // NullPointerException 발생
		
		int[] arr = null;
		int num = arr[0];  // NullPointerException 발생
		
	}

}
