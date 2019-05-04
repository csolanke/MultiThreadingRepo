
public class TestThreadPriority extends Thread {

	@Override
	public void run() {

		System.out.println("Thread name is " + Thread.currentThread().getName());
		System.out.println("Thread ID is " + Thread.currentThread().getId());
		System.out.println("Thread Priority is " + Thread.currentThread().getPriority());

		
	}
	
	public static void main(String[] args) {
		
		TestThreadPriority t1 = new TestThreadPriority();
		
		TestThreadPriority t2 = new TestThreadPriority();
		
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		
	}

}
