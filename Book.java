public abstract class Book {
    private String ISBN;
    private Status status;
    private String author;
    private String title;

    public Book(String ISBN, Status status, String author, String title) {
        this.ISBN = ISBN;
        this.status = status;
        this.author = author;
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public Status getStatus() {
        return status;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    public boolean equals(String ISBN){
        if(this.ISBN==ISBN){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", status=" + status +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
    public void showDetails(){
        System.out.println("Fiction Book{ISBN: "+getISBN()+"Status: "+getStatus()+"Author: "+getAuthor()+"Title: "+getTitle());
    }

}
