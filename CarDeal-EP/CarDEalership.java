import java.util.ArrayList;

public class CarDEalership {

  ArrayList<Car> cars;


  public CarDEalership(ArrayList<Car> cars) {
    cars = new ArrayList<>(cars);
  }

  public Car getCar(int i) {
    return new Car(cars.get(i));
  }

  public void setCar(int i, Car car) {
    cars.remove(i);
    cars.add(i, new Car(car));
  }



}
