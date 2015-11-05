import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		FilmCollection fc = read(Arrays.asList(getAll()).get(0));
		for (Film f : fc.getFilms()) {
			System.out.println(f.getName() + "\n");

		}

	}

	// file list
	public static String[] getAll() {
		StringBuilder ret = new StringBuilder();
		for (File f : (new File("./collections").listFiles())) {
			ret.append(f.getName() + " ");

		}
		return ret.toString().split(" ");
	}

	public static FilmCollection read(String filename)
			throws FileNotFoundException, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"./collections/" + filename));
		try {
			return (FilmCollection) ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ois.close();
		}
		return null;
	}

	public static void write(FilmCollection fc) throws FileNotFoundException,
			IOException {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"./collections/" + Integer.toString(fc.hashCode())));
		oos.writeObject(fc);
		oos.flush();
		oos.close();
	}
}
