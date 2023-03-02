import java.util.Scanner;

public class Main {

    static Store store = new Store();

    public static void main(String[] args) {
        Movie[] movies = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("12 Angry Men", "DVD", 8.9),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        for (int i = 0; i < movies.length; i++) {
            store.setMovie(i, movies[i]);
        }

        printStore();
        userInput();

    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        String status = "continue";
        while (status.equals("continue")) {
          System.out.print("\nPlease choose an integer between 0 - 9: ");
          int filmIndex = scanner.nextInt();
          scanner.nextLine();
          Movie movie = store.getMovie(filmIndex);
          System.out.print("Set a new rating for " + store.getMovie(filmIndex).getName() + ": ");
          Double newRating = scanner.nextDouble();
          scanner.nextLine();
          movie.setRating(newRating);
          store.setMovie(filmIndex, movie);
          printStore();
          System.out.print("To edit another rating, type: 'continue': ");
          status = scanner.next();
        }
        scanner.close();
    }

    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }

}
