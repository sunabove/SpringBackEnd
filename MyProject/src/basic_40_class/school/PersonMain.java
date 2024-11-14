package basic_40_class.school;

public class PersonMain {

	public static void main(String[] args) {
		// Person 객체 생성
		Person person1 = new Person( "Alice a", 25 ) ; // 10
		Person person2 = new Person( "Alice b", 26 ) ; // 20
		Person person3 = new Person( "Alice c", 27 ) ; // 30
		
		Person person4 = person3 ;
		
		person4 = person1 ; 
		
		int age = person1.getAge() ;
		
        System.out.println( "age = " + age );
        
        String name = person1.getName();
        System.out.println( "name = " + name );
        
        person1.showInfo();
        
        person1.haveBirthday(); // 생일을 맞이함.
        
        person1.showInfo();
	}

}
