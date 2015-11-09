import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	private int testint;
	private double testdouble;
	private String teststring;
	private int broken;

	public PropertyReader() throws FileNotFoundException, IOException,
			IllegalArgumentException {
		Properties props = new Properties();
		props.load(new FileInputStream(new File("./config/props1.properties")));

		testint = Integer.valueOf(props.getProperty("testint"));
		testdouble = Double.valueOf(props.getProperty("testdouble"));
		teststring = props.getProperty("teststring");

		broken = Integer.valueOf(props.getProperty("brokenfield"));

		// strange, but works
		Object nonex = props.getProperty("NonExistKey");

	}

}
