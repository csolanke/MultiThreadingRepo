import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEcecutorDemo {
	
	public static void main(String[] args) {
		
		Runnable r1 = new Task("First task ");
		Runnable r2 = new Task("Second Task");
		Runnable r3 = new Task("Third Task");
		Runnable r4 = new Task("Task four");
		Runnable r5 = new Task("Task Five");
		
	
	ExecutorService pool = Executors.newFixedThreadPool(3);
	
	pool.execute(r1);
	pool.execute(r2);
	pool.execute(r3);
	pool.execute(r4);
	pool.execute(r5);

		pool.shutdown();
		
		
	}
	

}
