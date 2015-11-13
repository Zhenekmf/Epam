import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyReader {
	Map<String,Object> map =new HashMap<String, Object>();

	public PropertyReader() throws FileNotFoundException, IOException,
			IllegalArgumentException {
		Properties props = new Properties();
		props.load(new FileInputStream(new File("./config/props1.properties")));
		map.put("testint",Integer.valueOf(props.getProperty("testint")));
		map.put("testdouble", Double.valueOf(props.getProperty("testdouble")));
		map.put("teststring",props.getProperty("teststring"));


	}

	public Map<String, Object> getMap() {
		return map;
	}

	
}
