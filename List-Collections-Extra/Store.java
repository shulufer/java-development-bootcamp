import java.util.ArrayList;


public class Store {


  private ArrayList<Book> books;

  public Store() {
    books = new ArrayList<>();
  }



  public Store(ArrayList<Book> books) {
    ArrayList<Book> books2  = new ArrayList<>(books);
    books2  = books;
    this.books = books2;
  }


  public Book getBook(int i) {
    Book book = new Book(books.get(i));
    return book;
  }

  public void setBook(int i, Book book) {
    Book book2 = new Book(book);
    this.books.add(i, book2);

  }

  public void addBook(Book book) {
    Book book2 = new Book(book);
    this.books.add(book2);
  }

  public boolean contains(Book book) {
    return this.books.contains(book);
  }




  // @Override
  //   public boolean equals(Object o) {
  //       if (o == this)
  //           return true;
  //       if (!(o instanceof Store)) {
  //           return false;
  //       }
  //       Store store = (Store) o;
  //       return Objects.equals(books, store.books);
  // }

  public void sellBook(String title){
    for (int i = 0; i < books.size(); i++) {

        if(books.get(i).getTitle().equals(title)) {
          books.remove(i);
        }
      }
    }










}
