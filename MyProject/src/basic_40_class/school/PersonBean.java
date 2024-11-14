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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
