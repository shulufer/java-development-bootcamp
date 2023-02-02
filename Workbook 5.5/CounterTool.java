import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.print("1. Pick a number to count by:");
        int count = scan.nextInt();

        System.out.print("2. Pick a number to strat counting from:");
        int startCount = scan.nextInt();

        System.out.print("3. Pick a number to count to:");
        int countTo = scan.nextInt();

        for (int i = startCount; i <= countTo; i = i + count) {
          counter(i);
        }


       // See detailed instructions on Learn the Part.

        scan.close();
    }

    /**
     * function name = counter
     * @param startCount
     *
     * 1. Print count
     */
    public static void counter(int startCount) {
      System.out.print(startCount + " ");
    }
}
