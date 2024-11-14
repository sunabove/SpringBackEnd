package basic_46.exception;

public class TryCatchExample {

	public static void main(String[] args) { 
		
		try {
			String str = null;
			str.length(); 
			
			int[] arr = null;
			int num = arr[0];
		} catch (NullPointerException e) {
			System.out.println( "NullPointerException이 발생하였습니다." );
		} 
		
	}

}
