import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalcMinus mySub = new CalcMinus();
        CalcPlus myAdd = new CalcPlus();
        System.out.println("Enter an array of adding or subtracting two numbers : ");
        String[] myArray = new String[3];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<3;i++)
            myArray[i]=input.nextLine();

        if (myArray[1].equals("+")) {
            myAdd.setNumber1(Integer.parseInt(myArray[0]));
            myAdd.setNumber2(Integer.parseInt(myArray[2]));
            myAdd.calc(myAdd.getNumber1(), myAdd.getNumber2());
        }
        else{
            mySub.setNumber1(Integer.parseInt(myArray[0]));
            mySub.setNumber2(Integer.parseInt(myArray[2]));
            mySub.calc(mySub.getNumber1(), mySub.getNumber2());
        }
    }
}
