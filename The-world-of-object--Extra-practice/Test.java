import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      // Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01");
      // Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02");
      // Contact contact3 = new Contact("Charlie", "345-678-9012", "1994-03-03");
      // Contact contact4 = new Contact("David", "456-789-0123", "1996-04-04");

      // Contact copyContact1 = new Contact(contact1);
      // Contact copyContact2 = new Contact(contact3);



      // // contact1.toAge(contact1.getBirthDate());
      // // System.out.println(contact1.toAge(contact1.getBirthDate()));

      // System.out.println(contact1.getAge());

      // contact1.setBirthDate("1989-01-01");

      // System.out.println(contact1.getAge());

      // Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01");
      // Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02");


      // Contact[] contacts = {contact1, contact2};
      // ContactManager contactManager = new ContactManager(contacts);


      // // Test the getContact method
      // Contact retrievedContact = contactManager.getContact(0);
      // System.out.println(retrievedContact.getName());


      // // Test the setContact method
      // Contact newContact = new Contact("Charlie", "345-678-9012", "1994-03-03");
      // contactManager.setContact(newContact, 0);


      // // Verify that the contact was updated
      // retrievedContact = contactManager.getContact(0);
      // System.out.println(retrievedContact.getName());

      class Data {
        public Contact[] contactData() {
          return new Contact[] {
                  new Contact("John Doe", "555-123-4567", "1985-01-01"),
                  new Contact("Jane Smith", "555-987-6543", "1990-02-14"),
                  new Contact("Alice Johnson", "555-345-6789", "1975-03-30"),
                  new Contact("Bob Brown", "555-567-8910", "2000-12-25"),
                  new Contact("Charlie Davis", "555-111-2222", "1983-07-04"),
                  new Contact("Diana White", "555-333-4444", "1997-11-18"),
                  new Contact("Ethan Green", "555-555-6666", "1988-05-22"),
                  new Contact("Fiona Black", "555-777-8888", "2002-10-31")
          };
        }



        public void displayContacts(ContactManager contactManager) {
          for (int i = 0; i < 8; i++) {
              Contact contact = contactManager.getContact(i);
              System.out.println(contact);
              System.out.println("\n");
          }
        }

        public Contact editedContact() {
          System.out.print("\tName: ");
          // pick up name
          String name = scan.nextLine();
          System.out.print("\tPhone Number: ");
          // pick up number
          String phoneNumber = scan.nextLine();
          System.out.print("\tBirth Date: ");
          // pick up birth date
          String birthDate = scan.nextLine();

          return new Contact(name, phoneNumber, birthDate);
          // return a Contact object
        }



      }

      Data data = new Data();
      ContactManager contactManager = new ContactManager(data.contactData());
      data.displayContacts(contactManager);

      System.out.print("\nYou have 8 contacts. Enter 'continue' to edit them: ");
      String status = scan.nextLine();


      while (status.equals("continue")) {
          System.out.print("\nChoose an index from 0 to 7: ");
          int index = scan.nextInt();
          scan.nextLine(); // throwaway nextLine


          switch (index) {
            case 0:
              Contact tempContact0 = data.editedContact();
              contactManager.setContact(tempContact0, 0);
            break;
            case 1:
              Contact tempContact1 = data.editedContact();
              contactManager.setContact(tempContact1, 1);
            break;
            case 2:
              Contact tempContact2 = data.editedContact();
              contactManager.setContact(tempContact2, 2);
            break;
            case 3:
              Contact tempContact3 = data.editedContact();
              contactManager.setContact(tempContact3, 3);
            break;
            case 4:
              Contact tempContact4 = data.editedContact();
              contactManager.setContact(tempContact4, 4);
            break;
            case 5:
              Contact tempContact5 = data.editedContact();
              contactManager.setContact(tempContact5, 5);
            break;
            case 6:
              Contact tempContact6 = data.editedContact();
              contactManager.setContact(tempContact6, 6);
            break;
            case 7:
              Contact tempContact7 = data.editedContact();
              contactManager.setContact(tempContact7, 7);
            break;

            default:
              break;
          }

          System.out.println("\n\nUPDATED CONTACTS\n\n");
          data.displayContacts(contactManager);
          System.out.print("Enter 'continue' to make more changes: ");
          status = scan.nextLine();


      }


      scan.close();


    }
}
