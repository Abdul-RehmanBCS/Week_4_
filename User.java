public class User {
    public Book[] borrowedBooks;
    private String password;
    private String userName;

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void borrowBook(Book book){
        if(book!=null){
            for (int i=0;i<borrowedBooks.length;i++){
                borrowedBooks[i]=book;
            }
        }
    }
    public void returnBook(Book book){
        if(book!=null){
            for (int i=0;i<borrowedBooks.length;i++){
                borrowedBooks[i]=null;
            }
        }
    }
}
