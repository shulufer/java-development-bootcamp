import java.util.Scanner;

public class Hangman {

  static Scanner scan = new Scanner(System.in);

  /**
   * @param args
   */
  public static void main(String[] args) {

    System.out.println("\n Wellcome to Hangman");
    System.out.println("\n If you want to play please type: Yes");
    System.out.println(" ");
    String answer = scan.nextLine();
    while (answer.equals("Yes")) {
      String word = words[rondomNumberForArrays(words)];
      char[] wordChar = wordToChar(word);
      char[] underscore = wordToUnderscore(wordChar);
      int count = 0;
      char[] missedGuesses =  new char[6];
      char guess;

      while (count < 6) {
        System.out.print("\n Word: ");
        for (int i = 0; i < underscore.length; i++) {
          System.out.print(underscore[i] + " ");
        }
        System.out.println(" ");
        System.out.println("\n" + gallows[count]);
        System.out.print("\n Misses: ");
        System.out.print(missedGuesses);
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Guess: ");
        guess = scan.next().charAt(0);
        if (include(wordChar, guess)) {
          for (int i = 0; i < wordChar.length; i++) {
            if (wordChar[i] == guess) {
              underscore[i] = guess;
            }
          }
              if (!include(underscore, ('_'))) {
                System.out.println("\n You win.");
                break;
              }
            } else {
              missedGuesses[count] = guess;
              count++;
              if (count == 6) {
                System.out.println("\n You lose.");
                break;
              }
            }
      }
      break;
    }
    System.out.println("\n Thank you for play my game.");
  }

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    /**
     * function name:rondomNumberForArrays
     * @param words
     * @return number(int)
     * retuens the random number that number could be maximum arrays.length - 1.
     */
    public static int rondomNumberForArrays(String[] words) {
      double randomDouble = Math.random() * words.length;
      int number = (int)randomDouble;
      return number;
    }

    /**
     * function name: wordToChar
     * @param word(String)
     * @return char[]
     * return the string to char array
     */

    public static char[] wordToChar(String word) {
      char[] charArray = new char[word.length()];
      for (int i = 0; i < charArray.length; i++) {
        charArray[i] = word.charAt(i);
      }
      return charArray;
    }

    /**
     * function name: wordToUnderscore
     * @param wordChar
     * @return underscore
     * take the every char in char array and return them to '_' in a array
     */

    public static char[] wordToUnderscore(char[] wordChar) {
      char[] underscore = new char[wordChar.length];
      for (int i = 0; i < underscore.length; i++) {
        underscore[i] = '_';
      }
            return underscore;
    }

    /**
     * function name: include
     * @param words
     * @param w
     * @return include
     * if the char is in the char array return true, others false.
     */

    public static boolean include(char[] words, char w) {
      boolean include = false;
      for (int i = 0; i < words.length; i++) {
        if (words[i] == w) {
          include = true;
        }
      }
      return include;
    }
    public static String[] gallows = {
      "+---+\n" +
      "|   |\n" +
      "    |\n" +
      "    |\n" +
      "    |\n" +
      "    |\n" +
      "=========\n",

      "+---+\n" +
      "|   |\n" +
      "O   |\n" +
      "    |\n" +
      "    |\n" +
      "    |\n" +
      "=========\n",

      "+---+\n" +
      "|   |\n" +
      "O   |\n" +
      "|   |\n" +
      "    |\n" +
      "    |\n" +
      "=========\n",

      " +---+\n" +
      " |   |\n" +
      " O   |\n" +
      "/|   |\n" +
      "     |\n" +
      "     |\n" +
      " =========\n",

      " +---+\n" +
      " |   |\n" +
      " O   |\n" +
      "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
      "     |\n" +
      "     |\n" +
      " =========\n",

      " +---+\n" +
      " |   |\n" +
      " O   |\n" +
      "/|\\  |\n" +
      "/    |\n" +
      "     |\n" +
      " =========\n",

      " +---+\n" +
      " |   |\n" +
      " O   |\n" +
      "/|\\  |\n" +
      "/ \\  |\n" +
      "     |\n" +
      " =========\n"
  };
}
