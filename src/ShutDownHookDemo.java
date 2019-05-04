
public class ShutDownHookDemo {

	public static void main(String[] args) {

		Runtime.getRuntime().addShutdownHook(new Thread() {

			@Override
			public void run() {

				System.out.println("shutdown tASK COMPLETED ");

			}

		});
		
		System.out.println("main completed");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException es) {

			System.out.println(es);
		}
		
	}

}
