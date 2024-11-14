package basic_44.rectangle_01;

public class RectangleMain {
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5.0, 10.0); // 가로 5.0, 세로 10.0 

		// 첫 번째 사각형의 면적과 둘레 계산 및 출력
		System.out.println("가로: " + rect.getWidth() + ", 세로: " + rect.getHeight());
		System.out.println("면적: " + rect.calculateArea());
		System.out.println("둘레: " + rect.calculatePerimeter()); 
	}
	
}