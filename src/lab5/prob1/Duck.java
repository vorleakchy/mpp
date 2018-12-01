package lab5.prob1;

public abstract class Duck {
	private IFlyBehavior flyBehavior;
	private IQuackBehavior quackBehavior;
	
	public void fly() {
		flyBehavior.fly();
	}
	
	public void quack() {
		quackBehavior.quack();
	}
		
	public void swim() {
		System.out.println("	swimming");
	}
	
	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(IQuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public abstract void display();
}
