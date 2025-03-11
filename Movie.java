package classAndObjects;
class MovieDetails{
	private String movieName;
	private String director;
	private int yearOfRelease;
	private int totalNumberOfSongs;
	private String actorName;
	private static int totalMovies;
	{
		totalMovies++;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public int getTotalNumberOfSongs() {
		return totalNumberOfSongs;
	}
	public void setTotalNumberOfSongs(int totalNumberOfSongs) {
		this.totalNumberOfSongs = totalNumberOfSongs;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public static int getTotalMovies() {
		return totalMovies;
	}
	void printMovieDetails() {
		System.out.println("Moviename :"+movieName);
		System.out.println("director :"+director);
		System.out.println("actor :"+actorName);
		System.out.println("Songs :"+totalNumberOfSongs);
		System.out.println("Year :"+yearOfRelease);
	}
	
}
public class Movie {

	public static void main(String[] args) {
		MovieDetails m1=new MovieDetails();
		System.out.println("Total Movies in list :"+MovieDetails.getTotalMovies() +"\n");
		
		m1.setMovieName("TITANIC");
		m1.setDirector("James Cameron");
		m1.setActorName("Leonardo DiCaprio");
		m1.setYearOfRelease(1997);
		m1.setTotalNumberOfSongs(2);
		
		m1.printMovieDetails();
		

	}

}
