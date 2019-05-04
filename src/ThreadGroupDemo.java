
public class ThreadGroupDemo implements Runnable {

	@Override
	public void run() {
	
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		
		
		ThreadGroupDemo demo = new ThreadGroupDemo();
		
		ThreadGroup tg =new ThreadGroup("Parent Thread Group");
		
		Thread t1 = new Thread(tg, demo, "thread one");
		
		Thread t2 = new Thread(tg, demo,"thread two");
		
		Thread t3 = new Thread(tg, demo, "Thread three");
		
		t1.start();
		
		t2.start();
		
		t3.start();
		
		
		System.out.println("Thread Group Name" + tg.getName());
		
		tg.list();
	}

}
