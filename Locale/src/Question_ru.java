import java.util.ListResourceBundle;


public class Question_ru extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return CON_OBJECTS;
	}

	static final Object[][] CON_OBJECTS = {
			{ "1", "Первый ответ" },
			{ "2", "Второй ответ" },
			{ "3", "Третий ответ" } };

	

}
