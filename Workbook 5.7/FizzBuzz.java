public class FizzBuzz {
    public static void main(String[] args) {

        // See Learn the Part for detailed instructions.

      int number = 0;

      for (int i = number; i <= 18; i++) {

        if (((i % 3) == 0 ) && ((i % 5) != 0 )) {
          System.out.println(i + " Fizz");
        } else if (((i % 3) != 0 ) && ((i % 5) == 0 )) {
          System.out.println(i + " Buzz");
        } else if (((i % 3) == 0 ) && ((i % 5) == 0 )) {
          System.out.println(i + " FizzBuzz");
        }

      }


    }

}
