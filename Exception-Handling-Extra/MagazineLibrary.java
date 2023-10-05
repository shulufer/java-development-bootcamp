import java.util.ArrayList;

public class MagazineLibrary {
  private ArrayList<Magazine> magazines;


  public MagazineLibrary() {
    magazines = new ArrayList<>();
  }

  public Magazine getMagazine(int i) {
    return new Magazine(magazines.get(i));
  }

  public void addMagazine(Magazine magazine) {
    magazines.add(new Magazine(magazine));

  }

}
