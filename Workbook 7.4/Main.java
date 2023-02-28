 public class Main {

    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
        Person person2 = new Person(person);
        person2.setName("Jad Slim");
        person2.setSeatNumber(3);
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");
        System.out.println("Name: " + person2.getName() + "\n" + "Nationality: " + person2.getNationality() + "\n" + "Date of Birth: " + person2.getDateOfBirth() + "\n" + "Seat Number: " + person2.getSeatNumber() + "\n");

    }


}
