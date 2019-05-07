import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable {
	String name;

	public Task(String s) {

		name = s;

	}

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			if (i == 0) {
				Date d = new Date();

				SimpleDateFormat formatter = new SimpleDateFormat("hh :mm :ss ");

				System.out.println("Innitialization time for Thread :" + name + " is :" + formatter.format(d));

			}

			else {
				Date d = new Date();

				SimpleDateFormat format = new SimpleDateFormat("hh : mm: ss");
				System.out.println("Executing time for Thraed : " + name + "is :" + format.format(d));

			}

			System.out.println(name + "  Complete");

		}

	}

}
