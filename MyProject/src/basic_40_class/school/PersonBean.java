package basic_40_class.school;

public class PersonBean implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private boolean active ; 
    private int age;

    public PersonBean() {
    }

	public String getName() {
		return name;
	}
	
}
