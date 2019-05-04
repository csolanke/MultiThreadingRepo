
public class TestJoinMethodInJava extends Thread{
	
	@Override
	public void run() {
		super.run();
		
		for(int i=1 ; i<10; i++)
		{
			System.out.println(i + " of the Tread " + Thread.currentThread().getId());
		}
		
	}

	public static void main(String[] args) {
		
		
		TestJoinMethodInJava t1 = new TestJoinMethodInJava();
		TestJoinMethodInJava t2 = new TestJoinMethodInJava();
		TestJoinMethodInJava t3 = new TestJoinMethodInJava();
		
		t1.start();
		
		try {
			t1.join(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		t2.start();
		t3.start();
		
		
	}
	
	
}
