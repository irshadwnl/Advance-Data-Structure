import java.util.ArrayList;

class Library{
    String name;
    ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books=new ArrayList<>();
    }
    void addBook(Book book){
        books.add(book);
    }
    
    void displayBooks(){
        System.out.println("Library: "+name);
        for(Book b:books){
            System.out.println(b);
        }
    }
}
class Book{
    String title;
    String author;

    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    @Override
    public String toString(){
        return "Book{title='" + title + "', author='" + author + "'}";
    }
    
}
public class LibrarySystem {
    public static void main(String[] args) {
        Book b1=new Book("abcd", "unknown");
        Book b2=new Book("zyz", "sam");
        Book b3=new Book("1984", "sonu");

        Library l1=new Library("Cu Library");
        Library l2=new Library("Chitkara Library");

        l1.addBook(b3);
        l2.addBook(b3);
        l1.addBook(b2);
        l2.addBook(b1);
        
        l1.displayBooks();
        l2.displayBooks();

    }
}
