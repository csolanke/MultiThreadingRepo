
public class ThreadWithExtendingThreadClass extends Thread{
	
	@Override
	public void run() {
		System.out.println("thread is running");
	}
	
	public static void main(String[] args) {
		
		ThreadWithExtendingThreadClass obj1 = new ThreadWithExtendingThreadClass();
		
		ThreadWithExtendingThreadClass obj2 = new ThreadWithExtendingThreadClass();

		obj1.start();
        obj2.start();
        
        //obj1.run();
		
		
	}

}
