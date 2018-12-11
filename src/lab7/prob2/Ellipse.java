package lab7.prob2;

public class Ellipse implements ClosedCurve {
	private double a;
	private double e;
	
	public Ellipse(double a, double e) {
		super();
		this.a = a;
		this.e = e;
	}

	@Override
	public double computePerimeter() {
		return 4 * a * e;
	}
	
}
