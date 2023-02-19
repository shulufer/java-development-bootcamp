public class HighScore {
    public static void main(String[] args) {

        int highScore = 0;

        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),};

        System.out.print("Here are the scores:");
        for (int i = 0; i < scores.length; i++) {
          System.out.print(scores[i] + " ");

          if (scores[i] > highScore) {
            highScore = scores[i];
          }
        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

    }

    /**
     * function name = randomNumber()
     * @return (int)randomNumber a number between 0 to 49999
     */

    public static int randomNumber() {
      double randomDoubleNumber = Math.random() * 50000;
      int randomNumber = (int)randomDoubleNumber;
      return randomNumber;

    }

}
