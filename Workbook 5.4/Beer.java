public class Beer {
    public static void main(String[] args) {
       // See detailed instructions on Learn the Part.
       for (int i = 99; i >= 1; i--) {
        sing(i);
       }


    }


    /**
     * function name = sing
     * @param i
     *
     * inside the functioin:
     * 1.print:
     *  bottles of beer on the wall, <i> bottles of beer!
     *  take one down, pass it around <i-1>, bottles of beer on the wall!
     */
    public static void sing(int i) {

      System.out.println("bottles of beer on the wall, " + i + " bottles of beer! 1  take one down, pass it around " + (i-1) +", bottles of beer on the wall!");

    }

}
