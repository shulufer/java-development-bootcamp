import java.util.ArrayList;
import java.util.List;

public class MovieStore {

  private List<Movie> movies;

  public MovieStore() {
    this.movies = new ArrayList<>();
  }

  public void addMovie(Movie movie) {
    movies.add(new Movie(movie));
  }


}
