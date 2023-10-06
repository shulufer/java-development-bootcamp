import java.util.ArrayList;

public class CarDealership {

  ArrayList<Car> cars;


  public CarDealership() {
    cars = new ArrayList<>();
  }



  public Car getCar(int i) {
    return new Car(cars.get(i));
  }

  public void setCar(int i, Car car) {
    cars.remove(i);
    cars.add(i, new Car(car));
  }

  public void addCar(Car car){
    cars.add(new Car(car));
  }





}
