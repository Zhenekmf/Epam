
public class Pencil extends Item {
	private final String name="Pencil";
	public Pencil(double price) {
		super(price);
	}
	@Override
	public String getName() {
		return this.name;
	}
}
