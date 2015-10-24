import java.util.ArrayList;

public class StarterKit {

	private ArrayList<Item> items = new ArrayList<Item>();

	public void addItem(Item i) {
		items.add(i);
		
	}
	
	public void multiAdd(Item ...it)
	{
		for(Item i:it)
		{
			items.add(i);
			
		}
		
		
	}
	public ArrayList<Item> getItems() {
		return items;
	}

	

	public double getTotalPrice()
	{
		double total=0;
		for(Item i:items)
		{
			total+=i.getPrice();
		}
		return total;
	
		
	}
	public void removeItem(int index) throws Exception
	{
		
		try
		{
			items.remove(index);
		}
		catch(Exception e)
		{throw e;}
	}
}
