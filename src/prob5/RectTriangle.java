package prob5;

/***
 * 직각삼각형 둘레 구하기
 * 
 * @author WonHo
 *
 */
public class RectTriangle extends Shape {

	private int width;
	private int height;

	public RectTriangle(int width, int height) {
		super(3); // 직각 삼각형
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return getWidth() * getHeight() * 0.5;
	}

	@Override
	public double getPerimeter() {
		double side = Math.sqrt(getWidth() * getWidth() + getHeight() * getHeight());
		return side + getWidth() + getHeight();
	}

	/***
	 * getter & setter
	 * 
	 * @return
	 */
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
