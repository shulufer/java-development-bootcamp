import java.time.LocalDate;

/**
 * Contact
 */
public class Contact {

  private String name;
  private String phoneNumber;
  private String birthDate;
  private int age;

  public Contact(String name, String phoneNumber, String birthDate) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.birthDate = birthDate;
    this.age = this.toAge(birthDate);
  }

  public Contact(Contact contact) {
  }

  public int toAge(String birthDate) {
    int age = LocalDate.now().compareTo(LocalDate.parse(birthDate));

    return age;
  }


  public String getBirthDate() {
    return this.birthDate;
  }


  public int getAge() {
    return this.age;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
    this.setAge(birthDate);
  }

  private void setAge(String birthDate) {
    this.age = this.toAge(birthDate);
  }




}
