import java.util.HashMap;

public class CityPopulationTracker {

  private HashMap<String, City> cityPopulations;


  public CityPopulationTracker() {
    this.cityPopulations = new HashMap<>();
  }

  public City getCity(String cityName) {
    return cityPopulations.get(new String(cityName));
  }

  public void setCity(City city) {
    cityPopulations.remove(city.getName(), city);
    cityPopulations.put(new String(city.getName()), new City(city));
  }


  public void addCity(City city) {
    cityPopulations.put(new String(city.getName()), new City(city));
  }

}
