
public class MemoryTest {

	
public static void main(String[] args) {
	
System.out.println(Runtime.getRuntime().totalMemory());	
	
System.out.println(Runtime.getRuntime().freeMemory());


for(int i=0; i<10000 ; i++)
{

	new MemoryTest();

}
	


System.out.println(Runtime.getRuntime().freeMemory());


System.gc();


System.out.println(Runtime.getRuntime().freeMemory());


	
	
}	
	
}
