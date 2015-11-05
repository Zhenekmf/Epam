import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Recoder {
	public static void Recode() throws FileNotFoundException, IOException {
		FileInputStream fr = new FileInputStream("./recode/8");
		FileOutputStream fw = new FileOutputStream("./recode/16");
		byte[] arr = new byte[fr.available()];
		fr.read(arr);
		fw.write((new String(arr, "UTF-16")).getBytes());
		fr.close();
		fw.close();
	}

}
