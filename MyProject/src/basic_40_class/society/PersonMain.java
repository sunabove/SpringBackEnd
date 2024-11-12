package basic_40_class.society;

public class PersonMain {

	public static void main(String[] args) {
		// Person 객체 생성
		Person person = new Person( "Alice", 25 );
		
        person.showInfo();
        
        // 생일을 맞이함.
        person.haveBirthday();
        
        person.showInfo();
	}

}
