public class Main {

    public static void main(String[] args) {

      Person hakan = new Person();
      hakan.name = "Hakan";
      hakan.nationality = "Turkey";
      hakan.dateOfBirth = "1990";
      hakan.passport = new String[] {hakan.name, hakan.nationality, hakan.dateOfBirth};
      hakan.seatNumber = 34;

      System.out.println("My name is " + hakan.name + ".I am from " + hakan.nationality + ".My birthyear is " + hakan.dateOfBirth + ".");
    }

}
