public class Airline {

    Person[] people; //array that stores Person objects...

    public Airline() {
      this.people = new Person[11];
    }



    public Person getPerson(int index) {
      Person person = people[index];
      return new Person(person);
    }

    /** Setter name: setPerson
     * @param person (Person)
     *
     * Inside the setter:
     *
     *   1. Index the array, and set that element equal to the Person object.
     */

    public void setPerson(Person person) {
      int index = person.getSeatNumber() - 1;
      people[index] = new Person(person);
    }

}
