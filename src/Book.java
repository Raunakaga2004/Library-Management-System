import java.lang.reflect.Array;
import java.util.*;

public class Book{
    private final int bookId;
    private String name;
    private String description;
    private String[] genre;
    private String author;
    private int copies;

    private ArrayList<IssueDetails> issueDate;

    Book(int bookId, String name){
        this.bookId = bookId;
        this.name = name;
        copies = 1;
    }
    Book(int bookId, String name, String description, String[] genre, String author){
        this.bookId = bookId;
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.author = author;
        copies = 1;
    }

//    public void editCopiesOfBook(int copies){
//        if(copies >= 0){
//            this.copies = copies;
//        }
//        else copies = 1;
//    }

    public int getBookId(){
        return bookId;
    }
    public String getBookTitle(){
        return name;
    }
}
