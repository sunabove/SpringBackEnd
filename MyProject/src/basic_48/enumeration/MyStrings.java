package basic_48.enumeration;

public enum MyStrings {

	STRING_ONE("ONE"), STRING_TWO("TWO");

	private final String text;

	MyStrings(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return this.text;
	}

	public static void main(String[] args) {
		
		for (MyStrings level : MyStrings.values()) {
			System.out.println(level + " ordinal = " + level.ordinal());
		}
		
	}
}
