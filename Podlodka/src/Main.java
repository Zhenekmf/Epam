


public class Main {

	public static void main(String[] args) {

		Boat boat = new Boat("Lodka", Boat.getNewEngine(20));
		boat.run();
		System.out.println("Is engine running:"+boat.getEngineStatus());
		System.out.println("Is boat active:"+boat.isActive());
		
		
		

	}

}
