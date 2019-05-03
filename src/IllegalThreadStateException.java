
public class IllegalThreadStateException extends Thread {

	@Override
	public void run() {
		System.out.println("thread running");
	}

	public static void main(String[] args) {

		IllegalThreadStateException o1 = new IllegalThreadStateException();

		o1.start();
		o1.start();

	}

}
