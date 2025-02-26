import java.util.Scanner;

public class Admin {
    private String adminUserName = "admin";
    private String adminPass = "12345678";
    private Library lib;

    Admin(String username, String password){
        if(!username.equals(adminUserName) || !password.equals(adminPass)){
            System.out.println("Invalid Credentials!");
        }
        else{
            adminInterface();
        }
    }
    private void adminInterface(){
        Scanner sc = new Scanner(System.in);

        boolean admin =  true;
        while(admin){
            System.out.println("Admin Menu : \n");

            System.out.println("1 : To add book");
            System.out.println("2 : To remove book");
            System.out.println("3 : To edit book details");
            System.out.println("4 : To display books");
            System.out.println("5 : Issue Book to the user");
            System.out.println("6 : Display books in library");

            System.out.println("0 : To exit admin interface");

            int type = sc.nextInt();
            admin = adminMenu(type);
        }

    }

    private boolean adminMenu(int type) {
        switch(type){
            case 0 :
                System.out.println("Exited Admin Interface!");
                return false;

            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                break;
            case 4 :
                break;
            case 5 :
                break;
            case 6 :
                break;
            default:
                System.out.println("Incorrect Input. Try Again!");
        }

        return true;
    }
}
