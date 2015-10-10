import java.util.ArrayList;

public class Notebook {
	private ArrayList<Record> list = new ArrayList<Record>();
	private int numberOfRecords;

	public void addRecord(String msg) {
		list.add(new Record(msg));
		numberOfRecords++;
	}

	public void delRecord(int id) throws Exception {
		try {
			list.remove(id);
			numberOfRecords--;
		} catch (Exception e) {

			throw e;

		}

	}

	public void editRecord(int id, String msg, Boolean append) throws Exception {
		try {
			if (append) {
				list.set(id, new Record(list.get(id).getText() + msg));

			} else {
				list.set(id, new Record(msg));
			}
		} catch (Exception e) {
			throw e;

		}
	}

	public String showRecord(int id) throws Exception {
		try {
			return Integer.toString(id) + ":" + list.get(id).getText();
		} catch (Exception e) {
			throw e;
		}

	}

	public String showAll() throws Exception {
		String ret = "Total number of records:"+Integer.toString(numberOfRecords)+"\n";
		for (int i = 0; i < list.size(); i++) {
			ret += showRecord(i) + "\n";

		}
		return ret;
	}
}
