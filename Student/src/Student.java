import java.util.ArrayList;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Student(String name, ArrayList<Group> groups) {
		super();
		this.name = name;
		
	}

}
