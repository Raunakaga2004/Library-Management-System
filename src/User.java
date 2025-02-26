import java.util.ArrayList;

public class User {
    private int userId;
    private String firstname;
    private String lastname;
    private int age;
    private ArrayList<Book> issuedBooks;
    private String phoneNumber;
    private String mailId;

    User(int userId, String firstname, String lastname, int age, String phoneNumber, String mailId){
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.mailId = mailId;
    }
}
