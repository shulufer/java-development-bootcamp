import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class EvenOrOdd {
    public static void main(String[] args) {
        // See Learn the Part for detailed instructions.
        int number = 50;
        for (int i = number; i > 0; i--) {

          if ((i % 2) == 0) {
            even(i);
          } else if ((i % 2) == 1) {
            odd(i);
          } else {
            System.out.println("This is not a number");
            System.exit(2);
          }
        }
    }

    /**
     * function nam = even
     * @param number
     *
     * 1. print: number is even.
     */
    public static void even(int number) {
      System.out.println(number + " even");
    }

    /**
     * function name =odd
     * @param number
     *
     * 1.print: number is odd.
     */
    public static void odd(int number) {
      System.out.println(number + " odd");
    }
}
