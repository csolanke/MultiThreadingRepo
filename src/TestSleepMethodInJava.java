
public class TestSleepMethodInJava extends Thread {
	
	
   @Override
public void run() {

for(int i=0 ; i<=5 ; i++)
{

	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		System.out.println(e);
	}
	
	System.out.println(i + " of thread having id : " + Thread.currentThread().getId());
}
   
   }
	
	public static void main(String[] args) {
		
		TestSleepMethodInJava test1 = new TestSleepMethodInJava();
		test1.start();
		
		TestSleepMethodInJava test2 = new TestSleepMethodInJava();
		test2.start();
		
		TestSleepMethodInJava test3 = new TestSleepMethodInJava();
		test3.start();
	}
	

}
