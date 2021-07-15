package practiceProblems;

public class Movie {
	
	private String title;
	private String studio;
	private String rating;
	
	public Movie(String title, String studio) {
		this(title, studio, "PG");
	}
	
	public Movie(String title, String studio, String rating) {
		this.title = title;
		this.studio = studio;
		this.rating = rating;
	}
	
	// Getters 
	public String getTitle() {
		return title;
	}
	public String getStudio() {
		return studio;
	}
	public String getRating() {
		return rating;
	}
	
	public static Movie [] getPG(Movie [] movies) {
		int i, size = 0, j = 0;
		for(i = 0; i < movies.length; i++) {
			if(movies[i].rating == "PG") {
				size++;
			}
		}
		
		Movie [] pgMovies = new Movie[size];
		for(i = 0; i < movies.length; i++) {
			if(movies[i].rating == "PG") {
				pgMovies[j] = movies[i];
				j++;
			}
		}
		
		return pgMovies;
	}
	
	public String toString() {
		return "Movie[title: " + title + ", studio: " + studio + ", rating: " + rating + "]";
	}
}
