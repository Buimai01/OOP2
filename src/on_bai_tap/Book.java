package on_bai_tap;

public class Book {
  public String bookName;
  public String author;
  public String bookCode;
  public int publicYear;
  public Book (){
    this.bookName = "Sách mặc định";
    this.bookCode = "MS0000";
    this.author = "CodeGym";
    this.publicYear = 2023;
  }
  public Book (String bookCode) {
    this.bookCode = bookCode;
  }
  public Book (String bookCode, String bookName) {
    this.bookCode = bookCode;
    this.bookName = bookName;
  }
  public Book (String bookCode, String bookName, String author) {
    this.bookCode = bookCode;
    this.bookName = bookName;
    this.author = author;
  }
  public Book (String bookCode, String bookName, String author, int publicYear) {
    this.bookCode = bookCode;
    this.bookName = bookName;
    this.author = author;
    this.publicYear = publicYear;
  }
  public String getBookName() {
    return this.bookName;
  }
  public void setBookName (String bookName) {
    this.bookName = bookName;
  }
  public String getBookCode () {
    return this.bookCode;
  }
  public void setBookCode(String bookCode) {
    this.bookCode = bookCode;
  }
  public String getAuthor () {
    return this.author;
  }
  public void setAuthor (String author) {
    this.author = author;
  }
  public int getPublicYear() {
    return this.publicYear;
  }
  public void setPublicYear (int publicYear) {
    this.publicYear = publicYear;
  }
  class AppBook {
    public static void main(String[] args) {
      Book book = new Book();
      book.setBookName("Lập trình hướng đối tượng cơ bản");
      System.out.println("Book code:" + book.getBookCode() );
      System.out.println("Book name:" + book.getBookName());
      System.out.println("Book author:" + book.getAuthor());
      System.out.println("Book public year:" + book.getPublicYear());
     book.setPublicYear(2022);
      System.out.println("Book code:" + book.getBookCode());
      System.out.println("Book name:" + book.getBookName());
      System.out.println("Book public year:" + book.getPublicYear());
      Book book1 = new Book("MS001", "PHP");
      book1.setAuthor("Loan");
      book1.setPublicYear(2002);
      System.out.println("Book code:" + book1.getBookCode());
      System.out.println("Book name:" + book1.getBookName());
      System.out.println("Book author:" + book1.getAuthor());
      System.out.println("Book public year:" + book1.getPublicYear());
    }
  }
  static class BookList {
    public Book[] listBook;
    public int numberOfBook;

    public BookList() {
      listBook = new Book[0];
      this.numberOfBook = 0;
    }

    public boolean addBook(Book newBook) {
      //Kiem tra do dai mang hien tai
      int currentListBookLength = listBook.length;
      //Khai bao mang moi co do dai bang mang cu + 1
      Book[] newListBook = new Book[currentListBookLength + 1];
      //copy data tu mang cu sang mang moi
      for (int i = 0; i < currentListBookLength; i++) {
        newListBook[i] = listBook[i];
      }
      //Gan gia tri phan tu cuoi cung trong mang moi bang gia can them vao mang
      newListBook[currentListBookLength] = newBook;
      numberOfBook++;
      listBook = newListBook;

      return true;
    }

    //Ham hien thi thong tin danh sach book
    public void displayListBook() {
      for (int i = 0; i < numberOfBook; i++) {
        System.out.println("Book number " + (i + 1));
        System.out.println("Book code: " + listBook[i].getBookCode());
        System.out.println("Book name: " + listBook[i].getBookName());
        System.out.println("Book author: " + listBook[i].getAuthor());
        System.out.println("Book public year: " + listBook[i].getPublicYear());
      }
    }
  }
  class AppBookList {
    public static void main(String[] args) {
      //Tạo 10 đối tượng sách với các phương thức khởi tạo khác nhau
      Book book1 = new Book();
      Book book2 = new Book("MS0002", "PHP");
      Book book3 = new Book("MS0003", "JAVA", "TUAN ANH");
      Book book4 = new Book("MS0004", "JS", "TUNG");
      Book book5 = new Book("MS0005", "RUBY ON RAILS", "CHINH");
      Book book6 = new Book("MS0006", "CSS", "TRUNG", 2021);
      Book book7 = new Book("MS0007", "HTML", "TRUNG", 2022);
      Book book8 = new Book("MS0008");
      Book book9 = new Book("MS0009", "REACT JS");
      Book book10 = new Book("MS0010", "REACT NATIVE");

      //Tạo 1 đối tượng BookList
      BookList bookList = new BookList();

      //Gọi phương thức thêm sách để thêm 10 đối tượng sách
      bookList.addBook(book1);
      bookList.addBook(book2);
      bookList.addBook(book3);
      bookList.addBook(book4);
      bookList.addBook(book5);
      bookList.addBook(book6);
      bookList.addBook(book7);
      bookList.addBook(book8);
      bookList.addBook(book9);
      bookList.addBook(book10);

      //Gọi phương thức hiển thị sách
      bookList.displayListBook();
    }
  }

    }





