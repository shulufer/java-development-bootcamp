import java.util.Scanner;

//import Scanner

public class Chatbot {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions.

        Scanner scan = new Scanner(System.in);
        //set up scanner.

        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it.
        String name = scan.nextLine();

        //add new a line before asking next question.
        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        //Pick up user's home and store it.
        String home = scan.nextLine();

        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at " + home + "! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        //Pick up age and store it.
        int age = scan.nextInt();


        //add new a line before asking next question.
        System.out.println("\nSo you're " +  age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400 / (double)age) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it.
        String empty = scan.nextLine();
        String language = scan.nextLine();


        //add new a line here.
        System.out.println(language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");

        //close scanner.
        scan.close();


    }
}
