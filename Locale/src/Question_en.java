import java.util.ListResourceBundle;

public class Question_en extends ListResourceBundle {
	@Override
	protected Object[][] getContents() {
		return CON_OBJECTS;
	}

	static final Object[][] CON_OBJECTS = {
			{ "1", "First answer" },
			{ "2", "Second answer" },
			{ "3", "Third answer" } };

}
