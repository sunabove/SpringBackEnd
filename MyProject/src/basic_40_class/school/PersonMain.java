package basic_40_class.school;

public class PersonMain {

	public static void main(String[] args) {
		// Person 객체 생성
		Person person = new Person( "Alice a", 25 ) ; // 10 
		
		Person person2 = person ;
		
		Person person3 = person ;
		
		int age = person.getAge() ; 
		
        System.out.println( "age = " + age );
        
        name = person.getName();
        System.out.println( "name = " + name );
        
        person.showInfo();
        
        person.haveBirthday(); // 생일을 맞이함.
        
        person.showInfo();
	}

}
