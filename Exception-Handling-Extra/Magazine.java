
public class Magazine {

  private String title;
  private String publisher;
  private int issueNumber;
  private int publicationYear;

  public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
    setTitle(title);
    setPublisher(publisher);
    setIssueNumber(issueNumber);
    setPublicationYear(publicationYear);
}


  public void setTitle(String title) {
    if (title == null || title == "") {
      throw new IllegalArgumentException("Title can not be blank or null.");
    } else {
      this.title = title;
    }
  }

  public void setPublisher(String publisher) {
    if (publisher == null || publisher == "") {
      throw new IllegalArgumentException("Publisher cannot be null or blank.");
    } else {
      this.publisher = publisher;
    }
  }

  public void setIssueNumber(int issueNumber) {
    if (issueNumber <= 0) {
      throw new IllegalArgumentException("Issue number must be greater than 0.");
    } else {

      this.issueNumber = issueNumber;
    }
  }

  public void setPublicationYear(int publicationYear) {
    if (publicationYear <= 0) {
      throw new IllegalArgumentException("Publication year must be greater than 0.");
    } else {

      this.publicationYear = publicationYear;
    }
  }

  public String getTitle() {
    return this.title;
  }

  public String getPublisher() {
    return this.publisher;
  }

  public int getIssueNumber() {
    return this.issueNumber;
  }

  public int getPublicationYear() {
    return this.publicationYear;
  }


}
