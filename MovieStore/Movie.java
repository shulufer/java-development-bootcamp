public class Movie {

  private String name;
  private String director;
  private String genre;
  private int year;
  private double raiting;


  public Movie() {
  }

  public Movie(String name, String director, String genre, int year, double raiting) {
    this.name = name;
    this.director = director;
    this.genre = genre;
    this.year = year;
    this.raiting = raiting;
  }


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDirector() {
    return this.director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getGenre() {
    return this.genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public double getRaiting() {
    return this.raiting;
  }

  public void setRaiting(double raiting) {
    this.raiting = raiting;
  }

}
