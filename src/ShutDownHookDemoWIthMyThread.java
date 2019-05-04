
public class ShutDownHookDemoWIthMyThread {

	public static void main(String[] args) {

		Runtime.getRuntime().addShutdownHook(new MyThread());

		System.out.println("main method working completed");

	}

}

class MyThread extends Thread {

	@Override
	public void run() {

		System.out.println("This is shutodown hook logic");

	}
}