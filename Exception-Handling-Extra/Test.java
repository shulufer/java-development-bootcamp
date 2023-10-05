public class Test {

  public static void main(String[] args) {

    Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
    System.out.println(magazine1.getTitle());

    try {

      magazine1.setTitle("");
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("try and catch block is done.");
    }


    try {

      magazine1.setPublisher("");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("try and catch block is done.");
    }



    try {
      magazine1.setIssueNumber(-1);

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("try and catch block is done.");
    }

    try {

      magazine1.setPublicationYear(0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("try and catch block is done.");
    }


    try {

      Magazine magazine2 = new Magazine("", "Publisher 2", 2, 2020);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("try and catch block is done.");
    }




  }
}
