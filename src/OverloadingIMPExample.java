
public class OverloadingIMPExample {

	
	public  void displayType(Object obj)
	{
		System.out.println("Object Type called");
	}
	
	public  void displayType(Integer obj)
	{
		System.out.println("Interger wrapper Type called");
	}
	
	
	public  void displayType(String obj)
	{
		System.out.println("String Type called");
	}
	
	
	public  void displayType(int in)
	{
		System.out.println("Interger wrapper Type called");
	}
	
	
	public static void main(String[] args) {
		
		OverloadingIMPExample ex = new OverloadingIMPExample();
		
		int a = 20;
		
		ex.displayType(10);
		ex.displayType(a);

		
		
		
	}
	
}
