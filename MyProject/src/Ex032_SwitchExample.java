public class Ex032_SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday"); 
            case 2:
                System.out.println("Tuesday"); 
            case 3:
                System.out.println("Wednesday"); 
            case 4:
                System.out.println("Thursday"); 
            default:
                System.out.println("Other day");
        }
    }
}
