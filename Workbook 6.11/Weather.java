import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {

        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit;

        fahrenheit = celciusToFahrenheit(celsius);

        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");


    }

      /**
     * Function name: celciusToFahrenheit.
     * @param celsius ( double[] )
     * @return fahrenheit ( double[] )
     *
     * Inside the function:
     *     1. Creates a double[] array called 'fahrenheit'.
     *     2. Copies all the values from celsius to fahrenheit.
     *     3. Updates the fahrenheit values (F = (C/5 * 9) + 32).
     *     4. return fahrenheit.
     */

    public static double[] celciusToFahrenheit(double[] celsius) {
      double[] fahrenheit;
      fahrenheit = Arrays.copyOf(celsius, celsius.length);
      for (int i = 0; i < fahrenheit.length; i++) {
        fahrenheit[i] = ((celsius[i]/5 * 9) + 32);
      }

      return fahrenheit;
    }

      /**
     * Function name - printTemperatures
     * @param temp ( double[] )
     * @param tempType ( String ) can be: Celsius or Fahrenheit
     *
     * Inside the function:
     *  1. System.out.print(type + ": ");
     *  2. A loop prints the temperatures in ONE line System.out.print(temp[i] + " ");
     *  3. Prints a new line after the loop System.out.print("\n");
     */

    public static void printTemperatures(double[] temp, String tempType) {
      if (tempType == "Celsius") {
        System.out.print("Celsius: ");
        for (int i = 0; i < temp.length; i++) {
          System.out.print(temp[i] + ", ");
        }
      }
      System.out.println("");
      if (tempType == "Fahrenheit"){
        System.out.print("Fahrenheit: ");
        for (int i = 0; i < temp.length; i++) {
          System.out.print(temp[i] + ", ");
        }
      }
    }

}
