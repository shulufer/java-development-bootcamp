public class Movie {

    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name == null) {
          throw new IllegalArgumentException("Name mustn't be blank");
        } else {
          this.name = name;
        }
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (format == null || format.isBlank()) {
          throw new IllegalArgumentException("Format mustn't be blank");
        } else {
          this.format = format;
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10){
          throw new IllegalArgumentException("Rating must be equal or greater than 0 and equal or less than 10 ");
        } else {
          this.rating = rating;
        }
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }

}
