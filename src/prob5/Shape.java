package prob5;

public abstract class Shape {

	private int countSides; // 변의 수

	// 생성자
	public Shape(int countSides) {
		this.countSides = countSides;
	}

	// 메소드
	public abstract double getArea(); // 넓이

	public abstract double getPerimeter(); // 둘레길이

	// getter & setter
	public int getCountSides() {
		return countSides;
	}

	public void setCountSides(int countSides) {
		this.countSides = countSides;
	}

}
