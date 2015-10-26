import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTest {
	private Locale curLoc;
	private ResourceBundle quest;

	public LocaleTest(String str) {
		if (str.toUpperCase().equals("RU") || str.toUpperCase().equals("EN")) {
			curLoc = new Locale(str.toUpperCase());
			quest = ResourceBundle.getBundle("Question", curLoc);
		} else
			System.err.println("Wrong locale!");

	}

	public String getAns(String str) {
		if (quest.keySet().contains(str)) {
			return quest.getString(str);
		}
		return "Wrong number!";
	}
}
