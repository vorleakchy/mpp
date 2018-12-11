package lab7.prob3;

public interface Cache {
	//shouldn't be static
	default public long timeout() {
		//seconds
		return 1;
	}
}
