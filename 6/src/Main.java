
public class Main {

	
	public static void main(String[] args) throws Exception {
		Notebook nt=new Notebook();
		nt.addRecord("Hello world!");
		nt.addRecord("Second record");
		nt.addRecord("nextDeleted");
		System.out.println(nt.showAll());
		nt.editRecord(2, "Added text", true);
		System.out.println(nt.showRecord(2));
		nt.delRecord(2);
		System.out.println(nt.showAll());
		
		
		
	}

}
