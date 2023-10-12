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

  public List<Movie> filterByGenre(String genre) {
    return this.movies.stream()
                      .filter(movie -> movie.getGenre().equals(genre))
                      .toList();


  }

  public List<Movie> sortByReleaseYear() {
    return this.movies.stream()
                      .sorted((movie1, movie2) -> Integer.compare(movie1.getYear(), movie2.getYear()))
                      .toList();
  }

  public List<Movie> getTopRatedMovies(int i) {
    return this.movies.stream()
                      .sorted((movie1, movie2) -> Integer.compare(movie1.getYear(), movie2.getYear()))
                      .limit(2)
                      .toList();
  }


}
