package lab5.prob1;

public class MuteQuack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("	cannot quack");
	}

}
