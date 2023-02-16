public class Doubles {
    public static void main(String[] args) {

   //      See Learn the Part for instructions.

        int dice1 = randomNumber();
        int dice2 = randomNumber();
        System.out.println("Dice 1 = " + dice1);
        System.out.println("Dice 2 = " + dice2);
        System.out.println("");

        while (dice1 != dice2) {
          dice1 = randomNumber();
          dice2 = randomNumber();

          System.out.println("Dice 1 = " + dice1);
          System.out.println("Dice 2 = " + dice2);
          System.out.println("");
        }

        System.out.println("You rolled doubles!");
    }

    /**
     *  Function name: randomNumber
     *  give to random number between from 1 to 6
     *  @return (int)randomNumber
     */

    public static int randomNumber() {
      double randomNumber = Math.random() * 6;
      randomNumber = randomNumber + 1;
      return (int)randomNumber;
    }

}
