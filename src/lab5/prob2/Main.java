package lab5.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<IShapeable> shapes = new ArrayList<IShapeable>();
		shapes.add(new Rectangle(10, 20));
		shapes.add(new Triangle(10, 20));
		shapes.add(new Circle(10));
		
		double sumArea = 0;
		for (IShapeable shape : shapes) {
			sumArea += shape.computeArea();
		}
		
		System.out.println("Sum of Areas = " + sumArea);
	}
}
