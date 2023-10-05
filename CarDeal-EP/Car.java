
public class Car {

  private String make;
  private String model;
  private BodyType bodyType;
  private int productionYear;
  private double price;
  private final static int MIN_YEAR = 1900;
  private final static int MIN_PRICE = 0;
  private final static int MAX_PRICE = 200_000;


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


  public String getMake() {
    return this.make;
  }

  public void setMake(String make) {
    if(make == null || make.equals("")) {
      throw new IllegalArgumentException("Make connot be null or blank.");
    } else {

      this.make = make;
    }
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    if(model == null || model.equals("")) {
      throw new IllegalArgumentException("Model connot be null or blank.");
    } else {
      this.model = model;
    }
  }

  public int getProductionYear() {
    return this.productionYear;
  }

  public void setProductionYear(int productionYear) {
    if (productionYear < MIN_YEAR) {
      throw new IllegalArgumentException("Production year must be greater than or equal to the minimum year.");
    } else {

      this.productionYear = productionYear;
    }
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    if (price < MIN_PRICE || price > MAX_PRICE) {
      throw new IllegalArgumentException("PRice must be wuthin a valid range.");
    }
    this.price = price;
  }

  public static int getMinYear() {
    return MIN_YEAR;
  }

  public static int getMaxPrice() {
    return MAX_PRICE;
  }

  public static int getMinPrice() {
    return MIN_PRICE;
  }
}
