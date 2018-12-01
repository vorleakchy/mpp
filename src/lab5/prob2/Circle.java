package lab5.prob2;

public final class Circle implements IShapeable {
	private final double radius;
	private final double PI = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double computeArea() {
		return PI * radius;
	}
	
	public double getRadius() {
		return radius;
	}

}
