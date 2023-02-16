import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.

        int diceRoll;
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start.");
        System.out.println(" - Great, here are the rules:\n");
        System.out.println(" - If you roll a 6, the game stops.");
        System.out.println(" - If you roll a 4, nothing happens.");
        System.out.println(" - Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        String type = scan.nextLine();

      scan.close();

        while (type.equals(type)) {
          diceRoll = rollDice();
          System.out.println("You rolled a " + diceRoll);
          if (diceRoll == 6) {
            System.out.println("End of game.");
            break;
          } else if (diceRoll == 4) {
            System.out.println("Zero points. Keep rolling.");
            System.out.println("...............");
            System.out.println("...............");
            continue;
          }else {
            score = score + 1;
            System.out.println("...............");
            System.out.println("...............");
            System.out.println("One point. Keep rolling.");

          }

        }
          if (score > 3) {
            System.out.println("Wow, that's lucky. You win! Your score:" + score);
          } else {
            System.out.println("Tough luck, you lose :(");
          }





    }

    /**
     * function name: rollDice()
     *
     * @return (int)randomNumber
     *
     * - return a random number from 1 to 6.
     */

    public static int rollDice() {
      double randomNumber = Math.random() * 6;
      randomNumber = randomNumber + 1;
      return (int)randomNumber;
    }


}
