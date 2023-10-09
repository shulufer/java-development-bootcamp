public class LabTest {

  public static void main(String[] args) {
    // Microscope microscope = new Microscope("Nikon", "E200", 2021, 1000);
    // System.out.println("Microscope Details:");
    // System.out.println("Manufacturer: " + microscope.getManufacturer());
    // System.out.println("Model: " + microscope.getModel());
    // System.out.println("Year: " + microscope.getYear());
    // System.out.println("Magnification: " + microscope.getMagnification());
    // System.out.println("Maintenance: " + microscope.performMaintenance());


    // System.out.println();


    // Centrifuge centrifuge = new Centrifuge("Eppendorf", "5424R", 2020, 15000);
    // System.out.println("Centrifuge Details:");
    // System.out.println("Manufacturer: " + centrifuge.getManufacturer());
    // System.out.println("Model: " + centrifuge.getModel());
    // System.out.println("Year: " + centrifuge.getYear());
    // System.out.println("Max RPM: " + centrifuge.getMaxRPM());
    // System.out.println("Maintenance: " + centrifuge.performMaintenance());

    Microscope microscope1 = new Microscope("Nikon", "E200", 2021, 1000);
    Centrifuge centrifuge1 = new Centrifuge("Eppendorf", "5424R", 2020, 15000);

    // Test the copy constructors
    Microscope microscopeCopy = new Microscope(microscope1);
    Centrifuge centrifugeCopy = new Centrifuge(centrifuge1);

    System.out.println("Original Microscope: " + microscope1.getManufacturer() + " " + microscope1.getModel());
    System.out.println("Copied Microscope: " + microscopeCopy.getManufacturer() + " " + microscopeCopy.getModel());

    System.out.println("Original Centrifuge: " + centrifuge1.getManufacturer() + " " + centrifuge1.getModel());
    System.out.println("Copied Centrifuge: " + centrifugeCopy.getManufacturer() + " " + centrifugeCopy.getModel());
  }

}
