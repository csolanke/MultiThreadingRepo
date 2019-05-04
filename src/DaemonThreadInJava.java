
public class DaemonThreadInJava extends Thread {

	@Override
	public void run() {

		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread running");
		}

		else {
			System.out.println("Normal Thread Running");
		}

	}

	public static void main(String[] args) {

		DaemonThreadInJava t1 = new DaemonThreadInJava();
		t1.setDaemon(true);

		DaemonThreadInJava t2 = new DaemonThreadInJava();

		t1.start();
		t2.start();

	}

}
