package lab8.prob1.partJ;

import java.util.function.Supplier;

public class MethodExpression {

	public static void main(String[] args) {
		Supplier<Double> sup = Math::random;
		System.out.println(sup.get());
	}

}
