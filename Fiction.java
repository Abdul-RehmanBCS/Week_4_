public class Fiction extends Book implements Categorize{
    private String genre;

    public Fiction(String ISBN, Status status, String author, String title,String genre) {
        super(ISBN, status, author, title);
        this.genre=genre;
    }
    public void showDetails(){
        System.out.println("Fiction Book{ISBN: "+getISBN()+"Status: "+getStatus()+"Author: "+getAuthor()+"Title: "+getTitle()+"Genre: "+genre);
    }
    @Override
    public void displayCategoryDetails() {
        System.out.println("Fiction Book{ISBN: "+getISBN()+"Status: "+getStatus()+"Author: "+getAuthor()+"Title: "+getTitle()+"Genre: "+genre);
    }
}
