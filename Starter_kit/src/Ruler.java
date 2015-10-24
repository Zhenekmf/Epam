
public class Ruler extends Item{
	private final String name="Ruler";
	public Ruler(double price) {
		super(price);
		
	}
	@Override
	public String getName() {
		return this.name;
	}

}
