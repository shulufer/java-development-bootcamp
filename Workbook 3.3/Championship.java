public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).

        // Test Case 1
        // int gryffindor = 400;    //gryffindor points
        // int ravenclaw = 200;    //ravenclaw points


        // Test Case 2:
        // int gryffindor = 850;
        // int ravenclaw = 500;
        // >>Gryffindor takes the house cup!

        // Test Case 3:
        // int gryffindor = 499;
        // int ravenclaw = 500;
        // >>In second place, Gryffindor!

        // Test Case 4:
        int gryffindor = 400;
        int ravenclaw = 500;
        // >>In third place, Gryffindor!

        // Test Case 5:
        // int gryffindor = 100;
        // int ravenclaw = 500;
        // >>In fourth place, Gryffindor!

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        if (gryffindor > ravenclaw) {
          System.out.println("Gryffindor takes the house cup!");
        } else if (gryffindor == ravenclaw) {
          System.out.println("In second place, Gryffindor!");
        } else if ((gryffindor + 1) == ravenclaw) {
          System.out.println("In second place, Gryffindor!");
        } else if ((ravenclaw - gryffindor) <= 100) {
          System.out.println("In third place, Gryffindor!");
        } else {
          System.out.println("In fourth place, Gryffindor!");
        }
    }
}
