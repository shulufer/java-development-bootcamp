
public class Sphere extends Shape{



  public Sphere(double radius) {
    super(radius);

  }

  @Override
  public double getArea() {
    return (4 * Math.PI * Math.sqrt(getRadius()));
  }

  @Override
  public double getVolume() {
    return (4 * Math.PI * getRadius() * getRadius() *getRadius()) / 3;
  }



}
