public class LibraryManager {
    public Book[] libraryInventory=new Book[1];
    public User[] users=new User[1];

    public void borrowBook(User user,Book book){
        for(int i=0;i<libraryInventory.length;i++){
            if(book!=null){
                if(user!=null){
                    libraryInventory[i]=book;
                    System.out.println("Book is borrowed");
                    i++;
                }
            }
        }


    }
    public void addBook(Book book){
        if(book!=null){
            for(int i=0;i<libraryInventory.length;i++){
                if(book!=null){
                    libraryInventory[i]=book;
                    System.out.println("Book added Successfully");
                }
            }
        }
    }
    User user=new User();
    Fiction fiction=new Fiction("001",Status.Available,"Ahmed_Khan","Clean Code","Programming");
    public void generateReport(){
        System.out.println("User name: "+"Ahmed_Khan ,"+"Fiction Book{ISBN: "+fiction.getISBN()+"Status: "+fiction.getStatus()+"Author: "+fiction.getAuthor()+"Title: "+fiction.getTitle());
    }
    public void searchBook(String ISBN){
        for(int i=0;i< libraryInventory.length;i++){
            if(ISBN==libraryInventory[i].getISBN()){
                System.out.println(libraryInventory[i]);
            }
        }
    }
    public void returnBook(String ISBN){
        for(int i=0;i< libraryInventory.length;i++){
            if(ISBN==libraryInventory[i].getISBN()){
                libraryInventory[i]=null;
                System.out.println("Book returned");
            }
            else {
                System.out.println("Invalid ISBN");
            }
        }
    }

}
