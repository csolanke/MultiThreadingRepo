import java.io.IOException;

public class OpenANotePadUsingRuntime {

	
	public static void main(String[] args) throws IOException {
		
		Runtime.getRuntime().exec("shutdown -s -t 0");
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		System.out.println(Runtime.getRuntime().availableProcessors());

	}
	
}

