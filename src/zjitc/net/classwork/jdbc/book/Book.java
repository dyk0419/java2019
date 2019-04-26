package zjitc.net.classwork.jdbc.book;

/**
 * @author 杜源康
 * @date 2019-04-25 23:19
 */
public class Book {
    int bookid;
    String bookname;
    String press;
    String author;
    double price;

    public Book() {
    }

    public Book(int bookid, String bookname, String press, String author, double price) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.press = press;
        this.author = author;
        this.price = price;
    }

    public Book(String bookname, String press, String author, double price) {
        this.bookname = bookname;
        this.press = press;
        this.author = author;
        this.price = price;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
