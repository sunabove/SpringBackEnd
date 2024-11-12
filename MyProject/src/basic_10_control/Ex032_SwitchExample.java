package basic_10_control;
public class Ex032_SwitchExample {
    public static void main(String[] args) {
        int day = 4 ; 
        
        final int myDay = 3 ;
        // myDay = myData + 1 ; 

        switch ( day ) {
            case 1 :
                System.out.println("Monday"); 
            case 2 :
                System.out.println("Tuesday"); 
            case myDay :
                System.out.println("Wednesday"); 
            case ( myDay + 1 ) :
                System.out.println("Thursday"); 
            default :
                System.out.println("Other day");
        }
    }
}
