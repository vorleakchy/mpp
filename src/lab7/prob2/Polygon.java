package lab7.prob2;

public interface Polygon extends ClosedCurve {
	public double[] getSides();

	default double computePerimeter() {
		double sum = 0;
		
		for (double side : getSides()) {
			sum += side;
		}
		
		return sum;
	}
}
