
public class ThreadWithImplementingRunnable implements Runnable{

	@Override
	public void run() {
		
	System.out.println("thread is running now ...."
			+ "");
	}
	
	public static void main(String[] args) {
		
		ThreadWithImplementingRunnable object2 = new ThreadWithImplementingRunnable();

		Thread t1 = new Thread(object2);
		
		
		t1.start();
		
	}

}
