import java.util.Arrays;

public class ContactManager {
  private Contact[] contacts;



  public ContactManager() {
  }


  public ContactManager(Contact[] contacts) {
    Contact[] contacts2 = Arrays.copyOf(contacts, contacts.length);
    this.contacts = contacts2;
  }


  public Contact getContact(int index) {
    Contact[] contacts2 = Arrays.copyOf(this.contacts, this.contacts.length);
    return contacts2[index];
  }


  public void setContact(Contact contact, int index) {
    this.contacts[index] = new Contact(contact);
  }



}
