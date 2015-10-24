
public class Boat {
	private String name;
	private boolean active;
	private Engine engine;
	
	public Boat(String name, Engine engine) {

		this.name = name;
		this.engine = engine;
	}

	@DocumentableAnnotation
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@DocumentableAnnotation
	public String getName() {
		return name;
	}
	public boolean getEngineStatus()
	{
		return this.engine.isRunning();
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void run() {
		this.active = true;
		this.engine.startEngine();

	}

	public void stop() {
		this.active = false;

	}

	public static Engine getNewEngine(int power)
	{
		return new Engine(20);
				
		
	}
	private static class Engine {
		private boolean isRunning;
		private int power;

		public boolean isRunning() {
			return isRunning;
		}

		public void startEngine() {
			this.isRunning = true;
		}

		public Engine(int power) {

			this.power = power;
		}

		public void stopEngine() {
			this.isRunning = false;
		}

		public int getPower() {
			return power;
		}

		public void setPower(int power) {
			if (power > 0)
				this.power = power;
			else
				System.err.println("Power must be positive");
		}

	}
}
