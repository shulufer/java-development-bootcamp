import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");

      int computerRandom = 5;
      int guess = 6;
      double computerRandomDouble = Math.random() * 6;

      computerRandom = (int) computerRandomDouble;



       Scanner scan = new Scanner(System.in);

       while (computerRandom != guess) {
          guess = scan.nextInt();
          if (computerRandom != guess) {

            System.out.println("Try again.");
          }
       }

       System.out.println("Wictory");

       //See Learn the Part for detnstailed iructions.

        scan.close();
    }

}
