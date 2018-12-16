package lab8.prob1.partG;

import java.util.function.Predicate;

public class MyClass {
	Predicate<MyClass> p1 = (MyClass instance) -> this.equals(instance);
	Predicate<MyClass> p2 = this::equals;
	int x = 1;
	String y = "A";
	
	public MyClass(int x, String y) {
		this.x = x;
		this.y = y;
	}
	
	public void myMethod(MyClass cl) {
		System.out.println("Is this instance equal to cl? " + p2.test(cl));
		System.out.println("Is this instance equal to cl? " + p1.test(cl));

	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		else if (obj.getClass() != this.getClass()) return false;
		MyClass mc = (MyClass)obj;
		return mc.x == x && mc.y.equals(y);
	}
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass(1, "A");
		myClass.myMethod(myClass);
	}
	
}
