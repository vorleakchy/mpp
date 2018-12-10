package midterm;

public class Rectangle {
	private double side1;
	private double side2;
	
	private Rectangle() {
	}
	
	public static Rectangle fromTwoSides(double side1, double side2) {
		Rectangle rec = new Rectangle();
		rec.side1 = side1;
		rec.side2 = side2;
		
		return rec;
	}
	
	public static Rectangle fromOneSide(double side1, double diagonal) {
		Rectangle rec = new Rectangle();
		rec.side1 = side1;
		rec.side2 = Math.sqrt(diagonal * diagonal - side1 * side1);
		
		return rec;
	}
	
	public double computeArea() {
		return side1 * side2;
	}
}
