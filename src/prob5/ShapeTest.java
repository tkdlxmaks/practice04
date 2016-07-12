package prob5;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];

		// parameter ( width, height )
		shapes[0] = new Rectangle(5, 6);
		shapes[1] = new RectTriangle(6, 2);

		/* 출력 */
		for (Shape shape : shapes) {
			System.out.println("area : " + shape.getArea());
			System.out.println("perimeter : " + shape.getPerimeter());

			/* 여기서 resizeable 판단 필요 */
			if (shape instanceof Resizable) {
				Resizable resizable = (Resizable) shape;
				resizable.resize(0.5); // 절반으로 줄여라

				/* resizable된 둘레와 넓이 */
				System.out.println("new area : " + shape.getArea());
				System.out.println("new perimeter : " + shape.getPerimeter());
			}
		}

	}

}
