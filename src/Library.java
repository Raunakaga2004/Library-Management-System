import java.util.HashMap;

public class Library {
    private HashMap<Integer, Book> bookMap;

    public void addBook(Book book){
        bookMap.put(book.getBookId(), book);
        System.out.println("Book added : " + book.getBookTitle());
    }
    public void removeBook(int bookId){
        if(bookMap.containsKey(bookId)){
            bookMap.remove(bookId);
            System.out.println("Book removed successfully!");
        }
        else{
            System.out.println("Book not Found!");
        }
    }
    public Book searchBooks(int bookId){
        return bookMap.get(bookId);
    }
    public void listBooks(){
        System.out.println("List of Books in library : ");
        for(Book book : bookMap.values()){
            System.out.println(book.getBookId() + " : " + book.getBookTitle());
        }
    }
}
