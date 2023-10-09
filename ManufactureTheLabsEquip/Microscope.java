public class Microscope extends LabEquipment{

  private int magnification;
  private static final int MIN_MAGNIFICATION = 1960;

  public Microscope(String manufacturer, String model, int year, int magnification) {
    super(manufacturer, model, year);
    setMagnification(magnification);
  }


  public int getMagnification() {
    return this.magnification;
  }

  public void setMagnification(int magnification) {
    if (magnification < MIN_MAGNIFICATION) {
      throw new IllegalArgumentException("Magnification must be greater than or equal to the minimum magnification.");
    } else {

      this.magnification = magnification;
    }
  }


}