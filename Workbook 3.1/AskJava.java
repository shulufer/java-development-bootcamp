public class AskJava {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).


        double change = 3.50;
        double price = 2.50;
        boolean enoughMoney = (change >= price);
        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + enoughMoney + "\n");

        int capacity = 12;
        int people = 15;
        boolean peopleCapacityComparisons = (capacity >= people);
        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + peopleCapacityComparisons + "\n");

        String request = "PS5";
        String purchase = "Toy car";
        boolean happy = (request.equals(purchase));
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + happy + "\n");

        int space = 9;
        int guests = 8;
        boolean spaceGuestsComparisons = (space >= guests);
        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + spaceGuestsComparisons + "\n");

        int yourVotes = 24;
        int competitorVotes = 43;
        boolean electionResult = (yourVotes >= competitorVotes);
        System.out.println("Me: Hi Java, will I win the election?");
        System.out.println("Java: " + electionResult + "\n");


    }
}
