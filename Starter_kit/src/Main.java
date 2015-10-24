
public class Main {

	
	public static void main(String[] args) {
		StarterKit sKit=new StarterKit();
		sKit.multiAdd(new Pen(20),new Pen(40),new Pencil(10),new Ruler(15));
		System.out.println("Kit contains:");
		
		
		for (Item i : sKit.getItems()) {
			System.out.println(i.getName()+" which costs "+i.getPrice());
			
		}
		
	}

}
