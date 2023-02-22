import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        // The instructions for this workbook are on Learn the Part (workbook 6.13)

        // Create a 2D array of double values that can hold 3 rows and 5 elements per row./

        double[][] price = new double[3][5];
        price[0][0] = 12.99;
        price[0][1] = 8.99;
        price[0][2] = 9.99;
        price[0][3] = 10.49;
        price[0][4] = 11.99;
        price[1][0] = 0.99;
        price[1][1] = 1.99;
        price[1][2] = 2.49;
        price[1][3] = 1.49;
        price[1][4] = 2.99;
        price[2][0] = 8.99;
        price[2][1] = 7.99;
        price[2][2] = 9.49;
        price[2][3] = 9.99;
        price[2][4] = 10.99;

        System.out.println("Baking: " + price[0][0] + " " + price[0][1] + " " + price[0][2] + " " + price[0][3] + " " + price[0][4]);
        System.out.println("Becerage: " + price[1][0] + " " + price[1][1] + " " + price[1][2] + " " + price[1][3] + " " + price[1][4]);
        System.out.println("Cereals: " + price[2][0] + " " + price[2][1] + " " + price[2][2] + " " + price[2][3] + " " + price[2][4]);

        double[][] prices = {
          {12.99, 8.99, 9.99, 10.49, 11.99},
          {0.99, 1.99, 2.49, 1.49, 2.99},
          {8.99, 7.99, 9.49, 9.99, 10.99}
      };

      for (int i = 0; i < prices.length; i++) {
        switch (i) {
          case 0: System.out.print("Baking: "); break;
          case 1: System.out.print("Beverage: "); break;
          case 2: System.out.print("Cereals: "); break;
          default: break;
        }
        for (int j = 0; j < prices[i].length; j++) {
          System.out.print(prices[i][j] + " ");
        }
        System.out.print("\n");
      }
    }
}
