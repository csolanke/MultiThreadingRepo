
public class TestDemoGarbgeCollect {
	
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Object is garbage collected");
	}
	
	
	public static void main(String[] args) {
	
		TestDemoGarbgeCollect o1 = new TestDemoGarbgeCollect();
		
		TestDemoGarbgeCollect o2 = new TestDemoGarbgeCollect();
		
		o1 = null;
		o2 = null;
		
		System.gc();
		
		
	}
	

}
