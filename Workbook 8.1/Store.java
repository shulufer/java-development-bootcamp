import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Movie> movies = new ArrayList<>();

    public Store() {


    }


  // public Store(List<Movie> movies) {

  //   List<Movie> movies2 = new ArrayList<>();
  //   for (int i = 0; i < movies.lastIndexOf(movies); i++) {
  //     movies2.add(i, movies.get(i));
  //   }
  //   this.movies = movies2;
  // }


    public Movie getMovie(int index) {
        return movies.get(index);
    }

    public void setMovie(int index, Movie movie) {
        movies.remove(index);
        movies.add(index, movie);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
