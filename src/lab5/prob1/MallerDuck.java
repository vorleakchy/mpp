package lab5.prob1;

public class MallerDuck extends Duck {

	public MallerDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("	display");
	}

}
