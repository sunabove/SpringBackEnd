package basic_10_control;
public class Ex001_BooleanOperatorExample {
    public static void main(String[] args) {
        boolean isAdult = true;
        boolean hasTicket = false;

        // 논리곱
        if (isAdult && hasTicket) { // 두 조건이 모두 참일 때만 실행
            System.out.println("Access granted."); 
        }

        // 논리합
        if (isAdult || hasTicket) { // 둘 중 하나가 참이면 실행
            System.out.println("Partial access granted."); 
        }

        // 논리 부정
        if (!hasTicket) { // hasTicket이 false일 때 실행
            System.out.println("Please buy a ticket."); 
        }
    }
}
