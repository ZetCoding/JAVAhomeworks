import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String n = input.nextLine();
        System.out.print("Enter your Username : ");
        String u = input.next();
        System.out.print("Enter your password : ");
        String p = input2.nextLine();
        System.out.print("Enter your age : ");
        int a = input2.nextInt();
        Info.getInstance().create(n,u,p,a);
        Info.getInstance().show();
    }
}
