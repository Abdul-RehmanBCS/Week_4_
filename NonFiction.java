public class NonFiction extends Book implements Categorize{
    private String subject;

    public NonFiction(String ISBN, Status status, String author, String title,String subject) {
        super(ISBN, status, author, title);
        this.subject=subject;
    }
    public void showDetails(){
        System.out.println("NonFiction Book{ISBN: "+getISBN()+"Status: "+getStatus()+"Author: "+getAuthor()+"Title: "+getTitle()+"Subject: "+subject);
    }
    @Override
    public void displayCategoryDetails() {
        System.out.println("NonFiction Book{ISBN: "+getISBN()+"Status: "+getStatus()+"Author: "+getAuthor()+"Title: "+getTitle()+"Subject: "+subject);
    }

}
