import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Group {
	private Map<Student, Discipline> marks = new HashMap<Student, Discipline>();
	private ArrayList<Student> students=new ArrayList<Student>();
	private ArrayList<Discipline> disciplines=new ArrayList<Discipline>();
	public ArrayList<Discipline> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(ArrayList<Discipline> disciplines) {
		this.disciplines = disciplines;
	}

	public Map<Student, Discipline> getMarks() {
		return marks;
	}

	public void setMarks(Map<Student, Discipline> marks) {
		this.marks = marks;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

}
