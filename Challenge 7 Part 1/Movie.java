public class Movie {

    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, Double rating) {
      this.name = name;
      this.format = format;
      this.rating = rating;
    }

    public String getName() {
      return this.name;
    }

    public void setName() {
      this.name = name;
    }

    public String getFormat() {
      return this.format;
    }

    public void setFormat() {
      this.format = format;
    }

    public Double getRating() {
      return this.rating;
    }

    public void setRating() {
      this.rating = rating;
    }

    public String toString() {
      return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }





}
