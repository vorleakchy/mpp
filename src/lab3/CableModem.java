package lab3;

public abstract class CableModem {
	String ip;
	String model;
	double speed;
	
	abstract public void connect();
	abstract public void disconnect();
}
