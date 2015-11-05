
public class Main {

	public static void main(String[] args) {

		try {
			ByteIO.ReadWrite();
			SymbolIO.ReadWrite();
			Recoder.Recode();
			
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
