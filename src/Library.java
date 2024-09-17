import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library (){
        books = new ArrayList<>();
    }
    public void addBook (Book book){
        books.add(book);
    }
    public void removeBock (Book book){
        books.remove(book);
    }

    public void printAllInfo (){
        for (Book b : books){
            b.printBookInfo();
            System.out.println("--------------");
        }
    }
    public Book searchBook (String title){
        for (Book b : books){
            if (b.getTitle().equalsIgnoreCase(title));
            return b;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';

    }
}
