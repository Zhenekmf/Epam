import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class Film implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3861906255093908683L;
	private List<String> actors;
	private int rating;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Film(String[] actors, int rating, String name) {
		this.actors = Arrays.asList(actors);
		this.rating = rating;
		this.name=name;
	}
	public List<String> getActors() {
		return actors;
	}
	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	}
	public int getRating() {
		return rating;
	}
	
	public void addActor(String name)
	{
		actors.add(name);
		
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}