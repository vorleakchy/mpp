package lab5.prob1;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("	displaying");
	}
	
}
