package basic_40_class.society;

public class PersonMultipleConstructor {
	
    // 속성(필드)
    private String name; // 이름
    private int age; // 나이

    // 생성자 1
    public PersonMultipleConstructor() {
        this( "", 0 ); // 생성자 2 호출 
        
        this.name = "" ;
        this.age = 0 ;
    } 
    
    // 생성자 2
    public PersonMultipleConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    } 
    
} 