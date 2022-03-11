import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Operative {
    public static void main(String[] args) throws Operative {
        Operative user = new Operative();
        System.out.println("Enter something");
        Scanner input = new Scanner(System.in);
        try {
            String z = input.nextLine();
            user.method1(z);
        }
        catch (InputMismatchException e){
            System.out.println("Please enter Strings!");
        }
        catch (Exception e) {
            System.out.println("An Error found -> "+e);
        }
    }
}
