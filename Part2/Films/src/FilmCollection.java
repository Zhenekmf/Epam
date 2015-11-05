import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


class FilmCollection implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4851472031304748198L;
	private List<Film> films;

	public String getActors(Film f) {
		StringBuilder ret = new StringBuilder();
		for (String s : f.getActors()) {
			ret.append(s + "; ");
		}
		return ret.toString();
	}

	public void addFilm(Film f) {
		this.films.add(f);
	}
	
	public FilmCollection() {
		this.films=new ArrayList<Film>();
	}

	public List<Film> getFilms() {
		return films;
	}

}
