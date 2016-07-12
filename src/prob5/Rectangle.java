package prob5;

// 직각사각형
public class Rectangle extends Shape implements Resizable {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double rate) {
		setWidth(getWidth() * rate);
		setHeight(getHeight() * rate);
	}

	@Override
	public double getArea() {
		/* 가로 * 세로 */
		return getWidth() * getHeight();

	}

	@Override
	public double getPerimeter() {
		/* 2*(가로+세로) */
		return 2 * (getWidth() + getHeight());
	}

	// getter & setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
