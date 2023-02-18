import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();
        System.out.println("");

        int yourCardNumber = drawRandomCard();
        String yourCard = cardString(yourCardNumber);
        int yourCardNumberTwo = drawRandomCard();
        String yourCardTwo = cardString(yourCardNumberTwo);
        int yourScore = yourCardNumber + yourCardNumberTwo;
        System.out.println("Your cards:\n" + yourCard + " \n and a \n " + yourCardTwo);
        System.out.println("");
        System.out.println("Your score is :" + yourScore);
        System.out.println("");

        int computerCardNumber = drawRandomCard();
        String computerCard = cardString(computerCardNumber);
        int computerCardNumberTwo = drawRandomCard();
        String computerCardTwo = cardString(computerCardNumberTwo);
        int computerScore = computerCardNumber + computerCardNumberTwo;
        System.out.println("Computer Card:\n" + computerCard + "\n and a \n" + faceDown());
        System.out.println("");


        //Task 3 – Wait for the user to press enter.
        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>

        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>


        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden
        if (yourScore > 21) {
          System.out.println("You lose :(");

        }


        while (!hitOrStay().equals("stay")) {

          if (yourScore >= 21) {
            break;
          }
          int newNumber = drawRandomCard();
          String newCard = cardString(newNumber);
          yourScore = yourScore + newNumber;
          System.out.println("New card is a\n " + newCard);
          System.out.println("Your score is :" + yourScore);
          if (yourScore >= 21) {
            break;
          }

        }


        System.out.println("Computer Card:\n" + computerCard + "\n and a \n" + computerCardTwo);
        System.out.println("Computer score is :" + computerScore);
        System.out.println("");

        while ((yourScore <= 21) && (computerScore <= 17)) {
          System.out.println("");
          System.out.println("Computer take a card.");
          System.out.println("");
          int newComputerNumber = drawRandomCard();
          String newComputerCard = cardString(newComputerNumber);
          computerScore = computerScore + newComputerNumber;
          System.out.println("Computer's new card is a\n " + newComputerCard);
          System.out.println("Computer score is :" + computerScore);

        }

        if (yourScore > 21) {
          System.out.println("You lose :(");
        } else if (computerScore > 21) {
          System.out.println("You win :)");
        } else if (yourScore > computerScore) {
          System.out.println("Your score is :" + yourScore);
          System.out.println("Computer score is :" + computerScore);
          System.out.println("You win :)");
        } else  if (yourScore < computerScore) {
          System.out.println("Your score is :" + yourScore);
          System.out.println("Computer score is :" + computerScore);
          System.out.println("You lose :(");
        } else {
          System.out.println("Everybody win :) :) :)");
        }{

        }

        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop.


        //For tasks 9 to 13, see the article: Blackjack Part II.


    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard() {
      double randomDoubleNumber = Math.random() * 13;
      int randomNumber = (int)randomDoubleNumber + 1;
      return randomNumber;
    }

    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber) {
      String randomCard;
      switch (cardNumber) {
        case 1:
          randomCard = (
            "   _____\n"+
            "  |A _  |\n"+
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n");
        break;
        case 2:
          randomCard = (
            "   _____\n"+
            "  |2    |\n"+
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n");
         break;
         case 3:
          randomCard = (
            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n");
       break;
       case 4:
        randomCard = (
          "   _____\n" +
          "  |4    |\n"+
          "  | o o |\n"+
          "  |     |\n"+
          "  | o o |\n"+
          "  |____h|\n");
        break;
        case 5:
        randomCard = (
          "   _____ \n" +
          "  |5    |\n" +
          "  | o o |\n" +
          "  |  o  |\n" +
          "  | o o |\n" +
          "  |____S|\n");
         break;
         case 6:
         randomCard = (
          "   _____ \n" +
          "  |6    |\n" +
          "  | o o |\n" +
          "  | o o |\n" +
          "  | o o |\n" +
          "  |____6|\n");
         break;
         case 7:
          randomCard = (
            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n");
         break;
         case 8:
          randomCard = (
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n");
         break;
         case 9:
          randomCard = (
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n");
         break;
         case 10:
          randomCard = (
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n");
         break;
         case 11:
          randomCard = (
            "   _____\n" +
            "  |J  ww|\n"+
            "  | o {)|\n"+
            "  |o o% |\n"+
            "  | | % |\n"+
            "  |__%%[|\n");
         break;
         case 12:
          randomCard = (
            "   _____\n" +
            "  |Q  ww|\n"+
            "  | o {(|\n"+
            "  |o o%%|\n"+
            "  | |%%%|\n"+
            "  |_%%%O|\n");
         break;
         case 13:
          randomCard = (
            "   _____\n" +
            "  |K  WW|\n"+
            "  | o {)|\n"+
            "  |o o%%|\n"+
            "  | |%%%|\n"+
            "  |_%%%>|\n");


          break;

        default:
        randomCard = ("Sorry try again");
          break;
      }
      return randomCard;
    }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }

    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option
     */
    public static String hitOrStay() {

      System.out.println("hit or stay");
      String hitOrStay = scan.nextLine();
      while ((!hitOrStay.equals("hit")) && (!hitOrStay.equals("stay"))) {
        System.out.println("Try again! hit or stay");
        hitOrStay = scan.nextLine();
      }

      return hitOrStay;

    }


    }
