public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try
		{
		PropertyReader pr=new PropertyReader();
		
		}
		catch (Exception e)
		{
			
			e.printStackTrace();
		}

	}

	public static void Handle() {
		try {
			while (true) {

				Viewer.Handler();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}
