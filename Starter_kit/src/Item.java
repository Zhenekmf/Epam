
public abstract class Item {

	
	
	private double Price;
	
	
	public abstract String getName();
	
	protected double getPrice() {
		return Price;
	}
	protected void setPrice(double price) {
		
	}
	public Item(double price) {
		super();
		Price = price;
	}
	
	
	
}
