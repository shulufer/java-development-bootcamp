import java.util.HashMap;

public class CityPopulationTracker {

  private HashMap<String, City> cityPopulations;


  public CityPopulationTracker(HashMap<String,City> cityPopulations) {
    this.cityPopulations = new HashMap<>();
  }

  public City getCity(City city) {
    return new City(city);
  }


}
