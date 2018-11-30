package lab3;

public abstract class Channel {
	double bandwidth;
	boolean isFree;
	double speed;
	
	abstract public void release();
	abstract public void assign();
}
