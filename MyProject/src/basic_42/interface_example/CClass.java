package basic_42.interface_example;

public class CClass implements AInterface, BInterface {
	
	public CClass() { 
		
		System.out.println( this.a ); 
		
	}
	
	public static void main(String [] args) {
		System.out.println( "Hello ..." );
	}

}
