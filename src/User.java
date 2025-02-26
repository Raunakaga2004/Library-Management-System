import java.util.ArrayList;

public class User {
    int userId;
    String firstname;
    String lastname;
    int age;
    ArrayList<Book> issuedBooks;
    String phoneNumber;
    String mailId;

    User(int userId, String firstname, String lastname, int age, String phoneNumber, String mailId){
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.mailId = mailId;
    }
}
