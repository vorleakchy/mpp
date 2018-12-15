package standardtest.april2017.prob2;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
	}
	//implement
	public abstract String getName();
	
	public void addMessage(String msg) {
		queue.enqueue(msg);
	}
	
	public String nextMessage() {
		// TODO Auto-generated method stub
		try {
			return queue.dequeue();
		} catch (EmptyQueueException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		return null;
	}
}
