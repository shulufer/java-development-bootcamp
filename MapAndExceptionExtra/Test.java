import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    City city1 = new City("New York", "USA", 8500000);
    System.out.println(city1.getName());


    // Uncomment the following line to test invalid input for setName method
    // city1.setName("");


    // Uncomment the following line to test invalid input for setCountry method
    // city1.setCountry("");


    // Uncomment the following line to test invalid input for setPopulation method
    // city1.setPopulation(-1);


    // Uncomment the following line to test invalid input for the constructor
    // City city2 = new City("", "USA", 8500000);

    // CityPopulationTracker tracker = new CityPopulationTracker();

    // // Test the addCity method
    // tracker.addCity(new City("New York", "USA", 8550405));
    // tracker.addCity(new City("Los Angeles", "USA", 3971883));


    // // Test the getCity method
    // City nyCity = tracker.getCity("New York");
    // System.out.println("Population of New York: " + nyCity.getPopulation());


    // // Test the setCity method
    // City updatedNyCity = new City("New York", "USA", 8600000);
    // tracker.setCity(updatedNyCity);


    // // Verify that the city data was updated
    // nyCity = tracker.getCity("New York");
    // System.out.println("Updated population of New York: " + nyCity.getPopulation());
    Scanner scanner = new Scanner(System.in);


    String cityName = promptForCityName(scanner);


    String country = promptForCountry(scanner);


    int population = promptForPopulation(scanner);


    City newCity = new City(cityName, country, population);


    CityPopulationTracker tracker = new CityPopulationTracker();
    tracker.addCity(newCity);


    System.out.println("City added to the tracker: " + newCity.getName());

  }

  public static boolean isNullOrBlank(String input) {
    if ((input.equals(null)) || (input.equals(""))) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean incorrectPopulation(int population) {
    if ((population <= 0)) {
      return true;
    } else {
      return false;
    }
  }

  public static String promptForCityName(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid city name: ");
        String cityName = scanner.nextLine();
        if(isNullOrBlank(cityName)) {
          continue;
        } else {
          return cityName;
        }

    }
  }

  public static String promptForCountry(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid country: ");
        String country = scanner.nextLine();
        if(isNullOrBlank(country)) {
          continue;
        } else {
          return country;
        }
    }

  }

  public static int promptForPopulation(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid population (greater than 0): ");
        // First check if the next input is not an integer

        if (scanner.hasNextInt()) {
          int population = scanner.nextInt();
          if(incorrectPopulation(population)) {
            continue;
          } else {
            return population;
          }
        }
    }
  }









}
