public class Cylinder extends Shape{

    private double height;


  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
  }

  public double getHeight() {
    return this.height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double getArea() {
    return (Math.PI * Math.sqrt(getRadius()) * height);
  }

  @Override
  public double getVolume() {
    return ((2 * Math.PI * getRadius()) + (2 * Math.PI * getRadius() * height));
  }


}
