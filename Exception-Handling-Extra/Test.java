import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    // Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
    // System.out.println(magazine1.getTitle());

    // try {

    //   magazine1.setTitle("");
    // } catch (IllegalArgumentException e) {
    //   System.out.println(e.getMessage());
    // } finally {
    //   System.out.println("try and catch block is done.");
    // }


    // try {

    //   magazine1.setPublisher("");
    // } catch (Exception e) {
    //   System.out.println(e.getMessage());
    // } finally {
    //   System.out.println("try and catch block is done.");
    // }



    // try {
    //   magazine1.setIssueNumber(-1);

    // } catch (Exception e) {
    //   System.out.println(e.getMessage());
    // } finally {
    //   System.out.println("try and catch block is done.");
    // }

    // try {

    //   magazine1.setPublicationYear(0);
    // } catch (Exception e) {
    //   System.out.println(e.getMessage());
    // } finally {
    //   System.out.println("try and catch block is done.");
    // }


    // try {

    //   Magazine magazine2 = new Magazine("", "Publisher 2", 2, 2020);
    // } catch (Exception e) {
    //   System.out.println(e.getMessage());
    // } finally {
    //   System.out.println("try and catch block is done.");
    // }

    // Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
    // Magazine magazine2 = new Magazine("Magazine 2", "Publisher 2", 2, 2021);


    // MagazineLibrary library = new MagazineLibrary();

    // // Test the addMagazine method
    // library.addMagazine(magazine1);
    // library.addMagazine(magazine2);


    // // Test the getMagazine method
    // Magazine retrievedMagazine = library.getMagazine(0);
    // System.out.println(retrievedMagazine.getTitle());


    // // Test the setMagazine method
    // Magazine newMagazine = new Magazine("Magazine 3", "Publisher 3", 3, 2022);
    // library.setMagazine(newMagazine, 0);


    // // Verify that the magazine was updated
    // retrievedMagazine = library.getMagazine(0);
    // System.out.println(retrievedMagazine.getTitle());

    Scanner scanner = new Scanner(System.in);


    String title = promptForTitle(scanner);
    String publisher = promptForPublisher(scanner);
    int issueNumber = promptForIssueNumber(scanner);
    int publicationYear = promptForPublicationYear(scanner);


    Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);


    MagazineLibrary library = new MagazineLibrary();
    library.addMagazine(newMagazine);


    System.out.println("Magazine added to the library: " + newMagazine.getTitle());





  }

  public static boolean isNullOrBlank(String input) {
    boolean isNullOrBlank = true;
    if (input == null || input == "") {
      isNullOrBlank = false;
    }
    return isNullOrBlank;
  }

  public static boolean incorrectIssueNumber(int issueNumber) {
    boolean incorrectIssueNumber = true;
    if (issueNumber <= 0) {
      incorrectIssueNumber = false;
    }
    return incorrectIssueNumber;
  }

  public static boolean incorrectPublicationYear(int publicationYear) {
    boolean incorrectPublicationYear = true;
    if (publicationYear <= 0) {
      incorrectPublicationYear = false;
    }
    return incorrectPublicationYear;

  }

  public static String promptForTitle(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid title: ");
        String title = scanner.nextLine();
        if (isNullOrBlank(title)) {
          return title;
        }
    }
  }

  public static String promptForPublisher(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid publisher: ");
        String publisher = scanner.nextLine();
        if (isNullOrBlank(publisher)) {
          return publisher;
        }
    }
  }

  public static int promptForIssueNumber(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid issue number (greater than 0): ");


        if (!scanner.hasNextInt()) {
          scanner.next();
          continue;
        }
        int scanInt = scanner.nextInt();
        scanner.nextLine();
        if (scanInt <= 0) {
          continue;
        } else {
          return scanInt;
        }

    }
  }

  public static int promptForPublicationYear(Scanner scanner) {
    while (true) {
      System.out.print("\nPlease enter a valid publication year (greater than 0): ");
        if (!scanner.hasNextInt()) {
          scanner.next();
          continue;
        }
        int scanInt = scanner.nextInt();
        scanner.nextLine();
        if (scanInt <= 0) {
          continue;
        } else {
          return scanInt;
        }
    }
}







}
