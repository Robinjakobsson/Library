public class Book {
    String title;
    String author;
    int edition;
    int year;
    Boolean available = true;

    public Book (String title, String author, int edition, int year){
        this.author = author;
        this.title = title;
        this.edition = edition;
        this.year = year;
        this.available = true;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
    public void printBookInfo (){
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("year = " + year);
        System.out.println("edition = " + edition);
        System.out.println("Available = " + available);
    }
    public void loanBook (){
        if (available == true){
            System.out.println("Book is now loaned.");
            edition = 0 ;
            available = false;
        }else {
            System.out.println("Book is not available.");
        }

    }
    public void returnBook (){

        System.out.println("Thank you!");
        available = true;
        edition = 1;
    }

    @Override
    public String toString() {
        return "Author: " + author + " Title: " + title + " Edition: " + " Year: " + year +  " Available: " + available;
    }
}
