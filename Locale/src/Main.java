import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("EN or RU?");
		LocaleTest lt =new LocaleTest(reader.nextLine());
		System.out.println("Номер вопроса?");
		System.out.println(lt.getAns(reader.nextLine()));
		reader.close();
	}

}
