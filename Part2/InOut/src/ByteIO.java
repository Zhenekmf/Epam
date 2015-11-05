import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIO {

	public static void ReadWrite() throws IOException, FileNotFoundException {
		FileInputStream in = new FileInputStream(new File("./Code"));
		FileOutputStream out = new FileOutputStream(new File("./Bytes"));

		byte[] arr = new byte[in.available()];
		in.read(arr);
		in.close();
		String code = new String(arr);
		int i = 0;

		for (String s : code.replace('\n', ' ').replace('\t', ' ').split(" ")) {
			try {

				Keywords.valueOf(s.toUpperCase());
				System.out.println(s);
				out.write(s.getBytes());
				out.write("\n".getBytes());
				i++;

			} catch (IllegalArgumentException e) {
				continue;
			}
		}
		out.write(Integer.toString(i).getBytes());
		out.close();

	}

}
