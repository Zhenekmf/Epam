import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Logger {
	private StringBuilder log;
	private Scanner reader;

	public Logger() {
		this.log = new StringBuilder();
	}

	private void addRecord() {
		Date dt = new Date();
		this.log.append(dt.toString() + ": test message:" + getMsg() + "\n");
		System.out.println("New record added");

	}

	public void Check() {
		reader = new Scanner(System.in);
		String s = "";
		if (reader.hasNext()) {
			s = reader.nextLine();
	//		System.out.println(s);
		}
		if (s.equals("add"))
			addRecord();
		else if (s.equals("show"))
			System.out.println(this.log.substring(0));
		else if (s.equals("search")) {
			System.out.println("Text to search in log:");
			s = reader.nextLine();
			if (log.indexOf(s) == -1)
				System.out.println("Not found");
			else {
				// System.out.println(log.substring(log.indexOf(s),
				// log.indexOf(s)+45));
				for (String str : log.toString().split("\n")) {
					if (str.contains(s))
						System.out.println(str);
				}
			}

		}
		// reader.close();

	}

	private int getMsg() {
		return new Random().nextInt(1000);

	}

}
