import java.util.ArrayList;

public class Lab {

  private ArrayList<LabEquipment> labEquipments;

  public Lab() {
    labEquipments = new ArrayList<>(labEquipments);
  }

  public LabEquipment getLabEquipment(int i) {
    return this.labEquipments.get(i).clone();
  }

  public void setLabEquipment(int i, LabEquipment labEquipment) {
    labEquipments.remove(i);
    labEquipments.add(i, labEquipment.clone());
  }
}
