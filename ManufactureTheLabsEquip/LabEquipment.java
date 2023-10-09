
public abstract class LabEquipment {

  private String manufacturer;
  private String model;
  private int year;
  private static final int MIN_YEAR = 1950;


  public String getManufacturer() {
    return this.manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    if (manufacturer ==  null|| manufacturer.equals("Manufacturer cannot be null or blank.")) {
      throw new IllegalArgumentException();
    } else {
      this.manufacturer = manufacturer;
    }
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    if (model == null || model.equals("Model cannot be null or blank.")) {
      throw new IllegalArgumentException();
    } else {
      this.model = model;
    }
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    if (year < MIN_YEAR) {
      throw new IllegalArgumentException("Year must be greater than or equal to the minimum year.");
    } else {
      this.year = year;
    }
  }


}
