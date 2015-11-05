import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SymbolIO {

	public static void ReadWrite() throws IOException, FileNotFoundException {

		FileReader reader = new FileReader(new File("./Code"));
		FileWriter writer = new FileWriter(new File("./Symbol"));
		StringBuilder str = new StringBuilder();
		int c;
		while ((c=reader.read())!=-1) {
			str.append((char)c);

		}

		Integer i = 0;
		for (String s : str.toString().replace('\n', ' ').replace('\t', ' ')
				.split(" ")) {
			try {

				Keywords.valueOf(s.toUpperCase());
				System.out.println(s);
				writer.write(s + "\n");

				i++;

			} catch (IllegalArgumentException e) {
				continue;
			}

		}
		writer.write(i.toString()	);
		writer.close();
		reader.close();
	}
}
