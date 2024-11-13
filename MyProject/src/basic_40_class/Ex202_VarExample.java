package basic_40_class;

public class Ex202_VarExample {
    public static void main(String[] args) {
        // 컴파일러가 타입을 자동으로 추론
        var name = "John";              // String 타입으로 추론
        var age = 25;                   // int 타입으로 추론
        var height = 180.5;             // double 타입으로 추론
        var fruits = new String[] {"Apple", "Banana", "Cherry"};  // String[] 타입으로 추론

        // 출력
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        
        System.out.print("Fruits: ");
        for (var fruit : fruits) {      // 각 요소의 타입도 자동 추론
            System.out.print( fruit + ", ");
        }
        System.out.println(); 
    }
}
