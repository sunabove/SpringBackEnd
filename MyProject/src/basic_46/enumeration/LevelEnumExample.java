package basic_46.enumeration;

public class LevelEnumExample {
	
	public static void main(String [] args) {
		
		enum Level { LOW, MEDIUM, HIGH } 
		Level myLevel = Level.MEDIUM;

		for(Level level : Level.values()){
		   System.out.println( level + " ordinal = " + level.ordinal()); 
		}

	}
}
