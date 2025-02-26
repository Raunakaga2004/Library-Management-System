import java.util.Date;

public class Book{
    int bookId;
    String name;
    String description;
    String[] genre;
    String author;
    Boolean issueStatus;
    Date issueDate; // last issue Date
    int issuePeriod; // issue period in days

    Book(int bookId, String name){
        this.bookId = bookId;
        this.name = name;
    }
    Book(int bookId, String name, String description, String[] genre, String author){
        this.bookId = bookId;
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.author = author;
    }
    public void issueBook(Date issueDate, int issuePeriod){
        this.issueDate = issueDate;
        this.issuePeriod = issuePeriod;
    }
}
