import java.util.ArrayList;
import java.util.Scanner;

public class Main extends MyData{

    public static void main(String[] args) {

        ArrayList<String> scores = new ArrayList<>();
        scores.add("Advanced programming   18");   // I hope so :)
        scores.add("Differential equations   18.5");
        scores.add("General mathematics2   17");
        scores.add("General physics   17.75");
        scores.add("Discrete mathematics   18");
        //=================
        System.out.print("Enter your full name : ");
        Scanner input = new Scanner(System.in);
        String myName = input.nextLine();
        System.out.print("Enter your Student number : ");
        double MyNum = input.nextDouble();
        System.out.print("Enter your father's name : ");
        String MyFatherName = input.next();
        System.out.println("\n");
        MyData<String,Double,String> myScores = new
                MyData<String,Double,String>(myName,MyNum,MyFatherName);

        myScores.setName(myName);
        myScores.setsNumber(MyNum);
        myScores.setFatherName(MyFatherName);


        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));
        }

    }

}
