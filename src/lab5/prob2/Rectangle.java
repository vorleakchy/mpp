package lab5.prob2;

public final class Rectangle implements IShapeable {
	private final double width;
	private final double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double computeArea() {
		return width * height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}

}
