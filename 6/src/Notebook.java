import java.util.ArrayList;
/**
 * 
 * @author Zhenek
 *
 */
public class Notebook {
	private ArrayList<Record> list = new ArrayList<Record>();
	private int numberOfRecords;
	/**
	 * Adds new record
	 * @param msg String to add in new record
	 */
	public void addRecord(String msg) {
		list.add(new Record(msg));
		numberOfRecords++;
	}
/**
 * Deletes record from array
 * @param id ID of record in array, counted from zero 
 * @throws Exception in case of incorrect id (outOfBounds)
 */
	public void delRecord(int id) throws Exception {
		try {
			list.remove(id);
			numberOfRecords--;
		} catch (Exception e) {

			throw e;

		}

	}
	/**
	 * Edits record by replacing it with new one or appending a string to it
	 * @param id ID of record to edit
	 * @param msg Message to append\replace with
	 * @param append Mode changer; Use "true" to append, "false" to replace
	 * @throws Exception outOfBounds in case of incorrect ID
	 */
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
	/**
	 * Shows the record 
	 * @param id ID of record to show
	 * @return Record text
	 * @throws Exception outOfBounds in case of incorrect ID
	 */
	public String showRecord(int id) throws Exception {
		try {
			return Integer.toString(id) + ":" + list.get(id).getText();
		} catch (Exception e) {
			throw e;
		}

	}
	/**
	 * Shows all records
	 * @return Number of records and strings with all records, divided with newlines
	 * @throws Exception outOfBounds in case of incorrect ID, looks to be inherited from showRecord
	 */
	public String showAll() throws Exception {
		String ret = "Total number of records:"+Integer.toString(numberOfRecords)+"\n";
		for (int i = 0; i < list.size(); i++) {
			ret += showRecord(i) + "\n";

		}
		return ret;
	}
}
