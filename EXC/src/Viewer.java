import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Viewer {
	private final static Scanner console = new Scanner(System.in);
	private static File curDir = new File("/");
	private static File prev;
	private static FileWriter writer;

	public static void Handler() {
		System.out.println("Command:");
		String s = console.next();
		if (s.equals(":list")) {
			showFiles();
		} else if (Arrays.asList(curDir.list()).contains(s)) {
			prev = curDir;
			goTo(s);
		} else if (s.equals(":up")) {
			if (!(prev == null)) {
				curDir = prev;
				showFiles();
			}

		} else if (s.equals(":remove")) {
			System.out.println("File to remove");
			fileRemove(console.next());

		} else if (s.equals(":new")) {
			System.out.println("File name:");
			fileCreate(console.next());

		} else if (s.equals(":add")) {

			System.out.println("Filename:");
			fileModify(console.next());
		} else if (s.equals(":quit")) {
			System.exit(0);
		}

	}

	private static void showFiles() {
		for (String s : curDir.list()) {
			System.out.println(s);

		}
	}

	private static void goTo(String s) {
		if (curDir.isDirectory()) {
			try {
				curDir = new File(curDir.getAbsolutePath() + "/" + s);
				showFiles();

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.err.println("No such directory!");
		}

	}

	private static void fileRemove(String s) {
		File f = new File(curDir.getAbsolutePath() + "/" + s);
		try {
			f.delete();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private static void fileModify(String s) {
		File f = new File(curDir.getAbsolutePath() + "/" + s);
		if (f.exists()) {
			try {
				writer = new FileWriter(f.getAbsoluteFile());
				System.out.println("Text to add:");
				writer.write(console.next());
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	private static void fileCreate(String s) {
		File f = new File(curDir.getAbsolutePath() + "/" + s);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.err.println("File already exists!");
		}

	}

}
