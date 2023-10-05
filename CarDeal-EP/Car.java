
public class Car {

  private String make;
  private String model;
  private BodyType bodyType;
  private int productionYear;
  private double price;


  public BodyType getBodyType() {
    return bodyType;
  }

  public void setBodyType(BodyType bodyType) {
    if (bodyType == null) {
      throw new IllegalArgumentException("Body type connot be null.");
    } else {
      this.bodyType = bodyType;
    }
  }
}
