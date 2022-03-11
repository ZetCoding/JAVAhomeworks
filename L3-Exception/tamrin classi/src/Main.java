import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Information{
  /*  protected Main(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    } */

    public static void main(String[] args) {
        String firstName1,firstName2,lastName1,lastName2;
        int age1,age2;
        System.out.println("\n User 1 please fill the fields below :");
        Scanner input = new Scanner(System.in);
        System.out.print("First name : ");
        firstName = input.next();
        System.out.print("Last name : ");
        lastName = input.next();
        System.out.print("Age : ");
        try {
            age = input.nextInt();
        } catch (InputMismatchException e){
            System.out.println("enter NUMBERS!!");
        }
        System.out.println("\n Now user 2 please fill the fields below : ");
        System.out.print("First name : ");
        firstName2 = input.next();
        System.out.print("Last name : ");
        lastName2 = input.next();
        System.out.print("Age : ");
        age2 = input.nextInt();
        try {
            method1(firstName2, lastName2, age2);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
