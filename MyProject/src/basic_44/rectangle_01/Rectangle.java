package basic_44.rectangle_01;

//Rectangle 클래스 정의
class Rectangle {
	// 사각형의 가로와 세로 속성
	private double width;
	private double height;

	// 생성자 (가로와 세로를 설정)
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 면적을 계산하는 메소드
	public double calculateArea() {
		return width * height;
	}

	// 둘레를 계산하는 메소드
	public double calculatePerimeter() {
		return 2 * (width + height);
	}

	// 가로와 세로 값을 가져오는 메소드
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	// 가로와 세로 값을 설정하는 메소드
	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
