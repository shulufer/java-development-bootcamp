import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions.


        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String answer1 = scan.nextLine();
        //store answer 1
        switch (answer1) {
          case "c":
            score += 5;
            break;
          default:
            break;
        }

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String answer2 = scan.nextLine();
        switch (answer2) {
          case "a":
            score += 5;
            break;
          default:
            break;
        }
        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        //store answer 3
        String answer3= scan.nextLine();
        switch (answer3) {
          case "d":
            score += 5;
            break;
          default:
            break;
        }

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        //store answer 4
        String answer4= scan.nextLine();
        switch (answer4) {
          case "a":
            score += 5;
            break;
          default:
            break;
        }


        //Task 2: Check each answer - For each correct answer, add 5 points to the score.

        System.out.println("Your final score is: " + score + "/20");

        //Task 3: print a message depending on the score

        // if the score is 15 or higher, print: "Wow, you know your stuff!";
        // if the score is between 5 and 15, print "Not bad!";
        // else, better luck next time.
        if (score == 20) {
          System.out.println("Wow, you know your stuff!");
        } else if (score == 15 || score == 10) {
          System.out.println("Not bad!");
        } else {
          System.out.println("Better luck next time!");
        }

        scan.close();

    }
}
