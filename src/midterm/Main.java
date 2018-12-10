package midterm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = Rectangle.fromOneSide(10, 10);;
		System.out.println(rec1.computeArea());
		Rectangle rec2 = Rectangle.fromTwoSides(10, 10);;
		System.out.println(rec2.computeArea());
	}

}
