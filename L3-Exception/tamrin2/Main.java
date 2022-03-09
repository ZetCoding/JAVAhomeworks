import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Coefficients {
    public static void main(String[] args) {
        System.out.println("\nImagine the Quadratic Equation as ax^2+bx+c=0 \nEnter the coefficients");
        Scanner input = new Scanner(System.in);
        double a,b,c;
        boolean sth=true;

        do {
            try{
                System.out.print("a : ");
                a = input.nextDouble();
                System.out.print("b : ");
                b = input.nextDouble();
                System.out.print("c : ");
                c = input.nextDouble();
                System.out.println(delta(a,b,c));
                sth = false;
            }
            catch (InputMismatchException e){
                System.out.println("Please enter NUMBERS next time!!!!");
                break;
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        while (sth);
    }
}
