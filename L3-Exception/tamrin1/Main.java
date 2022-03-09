
import java.util.Scanner;
import java.lang.String;
public class Main extends Identity {

    public Main(String msg) {
        super(msg);
    }
//          **** only use the Strings which are used in the constructor below!!!!! ****
    public static void main(String[] args) {
        Identity login = new Identity("arshia","arshia81","arshia138181");
       // Identity loginError = new Identity("Invalid information!");
        String a, b, c, x, y;
        System.out.println("please enter the fields : ");
        Scanner input = new Scanner(System.in);
        boolean sth = true;
        System.out.println(fullName);
        do {
            System.out.println("Full name :");
            a = input.nextLine();
            System.out.println("Username : ");
            b = input.nextLine();
            System.out.println("password : ");
            c = input.nextLine();
            try {
                login.diagnosis(a, b, c);
                sth = false;
            } catch (Exception e) {
                System.out.println("Invalid information!");
            }
        }
       while (sth);
    }
}
