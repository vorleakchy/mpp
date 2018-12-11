package lab7.prob2;

public class EquilateralTriangle implements Polygon {
	private double side;

	public EquilateralTriangle(double side) {
		super();
		this.side = side;
	}

	@Override
	public double[] getSides() {
		return new double[]{side, side, side};
	}
	
}
