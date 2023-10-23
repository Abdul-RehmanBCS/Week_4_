import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Book book=new Book();
        LibraryManager libraryManager=new LibraryManager();
        Fiction fiction=new Fiction("001",Status.Available,"Ahmed_Khan","Clean Code","Programming");
        NonFiction nonFiction=new NonFiction("002",Status.Available,"Sara_Ali","Cracking Code","Programming");
        System.out.println(fiction);
        System.out.println(nonFiction);
        libraryManager.generateReport();
        libraryManager.addBook(fiction);
        libraryManager.addBook(nonFiction);
        libraryManager.returnBook("001");
    }
}