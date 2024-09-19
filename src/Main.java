import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        boolean isRunning = true;
        Book loanedBook = new Book("loaned", "book", 0, 0);

        while (isRunning) {
            System.out.println("1. Add a book to the library");
            System.out.println("2. Search for a book by name");
            System.out.println("3. List all available books");
            System.out.println("4. Return a book");
            System.out.println("5. quit");

            try {
                int input = scanner.nextInt();
                scanner.nextLine();
                if ((input < 1) || input > 5) {
                    System.out.println("Invalid choice.");

                } else

                    switch (input) {
                        case 1:
                            Book book = new Book("please", "work", 1, 1337);
                            System.out.println("type in the author of the book");
                            book.setAuthor(scanner.nextLine());
                            System.out.println("Type in the title of the book");
                            book.setTitle(scanner.nextLine());
                            System.out.println("Type in the publishing year of the book");
                            book.setYear(scanner.nextInt());
                            library.addBook(book);
                            break;

                        case 2:
                            boolean found = false;
                            System.out.println("Type in the title please");
                            String search = scanner.nextLine();
                            Book foundbook = library.searchBook(search);
                            if (!search.equalsIgnoreCase(foundbook.title)) {
                                System.out.println("That book does not exist.");
                            } else
                                System.out.println(foundbook.toString());
                            loanedBook = foundbook;
                            found = true;
                            System.out.println("Do you want to lend this book?");
                            System.out.println("1. YES");
                            System.out.println("2. NO");

                            int loan = scanner.nextInt();

                            switch (loan) {
                                case 1:
                                    foundbook.loanBook();
                                    break;

                                case 2:
                                    break;
                            }

                            break;

                        case 3:
                            library.printAllInfo();
                            break;

                        case 4:
                            loanedBook.setEdition(1);
                            loanedBook.setAvailable(true);
                            System.out.println("thank you!");
                            break;

                        case 5:
                            System.out.println("goodbye!");
                            isRunning = false;
                            break;

                    }
                }        catch(InputMismatchException e){
                            System.out.println("Invalid choice, please enter a number 1-5");
                            scanner.nextLine();
            }
        }
    }
}