import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("- There are two players, you and the computer");
        System.out.println("- The dealer will give each player one card.");
        System.out.println("- Then, the dealer will draw five cards (the river)");
        System.out.println("- The player with the most river matches wins!");
        System.out.println("- If the matches are equal, everyone's a winner!");
        System.out.println("- Ready? Type anything if you are.");
        scan.nextLine();
        /*Task 2: Explain the rules

        >>Let's play Pokerito. Type anything when you're ready.
        |
        >>It's like Poker, but a lot simpler.
        >> (new line)
        >> • There are two players, you and the computer.
        >> • The dealer will give each player one card.
        >> • Then, the dealer will draw five cards (the river)
        >> • The player with the most river matches wins!
        >> • If the matches are equal, everyone's a winner!
        >> (new line)
        >> • Ready? Type anything if you are.
        |
        */


        /*Task 3: Present the user with a card
         println 'Here's your card:'
         <show card>
         <new line>
         println 'Here's the computer's card:'
         <show computer's card>
        */
        System.out.println("Here's your card:");
        System.out.println("");
        String yourCard = randomCard();
        System.out.println(yourCard);
        System.out.println("");

        System.out.println("Here's the computer's card:");
        System.out.println("");
        String computerCard = randomCard();
        System.out.println(computerCard);
        System.out.println("");


        int yourMatches = 0;
        int computerMatches =0;

        /** Task 4 - Draw five cards
         *
         * • print:  Now, the dealer will draw five cards. Press enter to continue.
         * • The dealer will draw a card every time the user presses enter.
         * • Before you draw a card, print the order it was drawn in:
         *      Card 1
         *      <2 new lines>
         *      <print card>
         *      Card 2
         *      <2 new lines>
         *      <print card>
         *      ...
         */

         if (!yourCard.equals(computerCard)) {
          System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        }


         for (int i = 1; i < 6; i++) {

          if (yourCard.equals(computerCard)) {
            System.out.println("Your card and computer card are same please try again.");
            break;
          }

          System.out.println("");
          System.out.println("");
          System.out.println("Press enter to continue.");
          scan.nextLine();
          String cardI = randomCard();
          System.out.println(cardI);

          if (yourCard.equals(cardI) && !yourCard.equals(computerCard)) {
            yourMatches++;
          } else if (computerCard.equals(cardI) && !yourCard.equals(computerCard)) {
            computerMatches++;
          }

         }


        /** Task 5 - Get the winner
         *
         * • Count your number of matches.
         * • Count the computer's number of matches.
         * • print: Your number of matches: <yourMatches>
         * • print: Computer number of matches:  <computerMatches>
         *
         * • If you have more matches, print: You win!.
         * • If the computer has more matches, print: The computer wins!
         * • If the matches are equal, print: everyone wins!.
         */
        System.out.println("");
        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("");
        System.out.println("Computer number of matches: " + computerMatches);
        System.out.println("");
        if (yourMatches > computerMatches) {
          System.out.println("You win!");
        } else if (yourMatches < computerMatches){
          System.out.println("The computer wins!!");
        } else {
          System.out.println("everyone wins!");

        }
         scan.close();
    }

    /** Task 1
     *
     * Function name – randomCard
     * @return (String)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).
     */

     public static String randomCard() {
      double randomNumber = Math.random() * 13;
      randomNumber = randomNumber + 1;
      int randomNumberInt = (int)randomNumber;
      String card;
      switch (randomNumberInt) {
        case 1:
          card = ("   _____\n" +
                  "  |A _  |\n"+
                  "  | ( ) |\n"+
                  "  |(_'_)|\n"+
                  "  |  |  |\n"+
                  "  |____V|\n" );
          break;
          case 2:
          card = ("   _____\n"+
                  "  |2    |\n"+
                  "  |  o  |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____Z|\n");
          break;
          case 3:
          card = ("   _____\n"+
                  "  |3    |\n"+
                  "  |  o  |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n");
          break;
          case 4:
          card = ("   _____\n"+
                  "  |4    |\n"+
                  "  |  o  |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____h|\n");
          break;
          case 5:
          card = ("   _____\n"+
                  "  |5    |\n"+
                  "  |  o  |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____S|\n");
          break;
          case 6:
          card = ("   _____\n"+
                  "  |6    |\n"+
                  "  |  o  |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____9|\n");
          break;
          case 7:
          card = ("   _____\n"+
                  "  |7   |\n"+
                  "  |  o  |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____7|\n");
          break;
          case 8:
          card = ("   _____\n"+
                  "  |8    |\n"+
                  "  |  o  |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____8|\n");
          break;
          case 9:
          card = ("   _____\n"+
                  "  |9    |\n"+
                  "  |  o  |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____9|\n");
          break;
          case 10:
          card = ("   _____\n"+
                  "  |10    |\n"+
                  "  |  o   |\n"+
                  "  |      |\n"+
                  "  |  o   |\n"+
                  "  |____10|\n");
          break;
          case 11:
          card = ("   _____\n"+
                  "  |V    |\n"+
                  "  |  o  |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____V|\n");
          break;
          case 12:
          card = ("   _____\n"+
                  "  |Q    |\n"+
                  "  |  o  |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____Q|\n");
          break;
          case 13:
          card = ("   _____\n"+
                  "  |K    |\n"+
                  "  |  o  |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____K|\n");
          break;

        default:
        card = "";
          break;


      }
      return card;

     }

}
