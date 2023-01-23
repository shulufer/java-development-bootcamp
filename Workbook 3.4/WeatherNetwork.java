public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).


        // int temp = 25; // It's warm. Go outside!
        // int temp = -1; // The forecast is FREEZING! Stay home!
        // int temp = 0; // The forecast is Chilly. Wear a coat!
        // int temp = 10; // The forecast is Chilly. Wear a coat!
        // int temp = 11; // It's warm. Go outside!
        int temp = -12; // The forecast is FREEZING! Stay home!
        if (temp > 10) {
          String forecast = "It's warm. Go outside!";
          System.out.println(forecast);
        } else if (temp >= 0 ) {
          String forecast = "The forecast is Chilly. Wear a coat!";
          System.out.println(forecast);
        } else {
          String forecast = "The forecast is FREEZING! Stay home!";
          System.out.println(forecast);
        }
    }
}
