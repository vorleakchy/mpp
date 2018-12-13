package lab8.prob1.partJ;

import java.util.function.Supplier;

public class InnerClass {

	public static void main(String[] args) {
		InnerClass innerClass = new InnerClass();
		Supplier<Double> mySup = (innerClass).new MySupplier();
		System.out.println(mySup.get());
	}
	
	class MySupplier implements Supplier<Double> {

		@Override
		public Double get() {
			return Math.random();
		}
		
	}
}
