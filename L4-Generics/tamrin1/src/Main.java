
import java.util.HashMap;
import java.util.Scanner;

public class Main extends MyMap {

    public Main(String FullName, int StudentNumber, double AvgScore) {
        super(FullName, StudentNumber, AvgScore);
    }
    public static void main(String[] args) {
        MyMap student = new MyMap();
        System.out.print("Enter your full name please: ");
        Scanner input = new Scanner(System.in);
        String FullName = input.nextLine();
        System.out.print("Enter your student number :  ");
       int StudentNumber = input.nextInt();
        System.out.print("Enter your avg score : ");
        double AvgScore = Double.parseDouble(input.next());
        student.setStudentNumber(StudentNumber);
        student.setAvgScore(AvgScore);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        HashMap<String,Double> map2 = new HashMap<String,Double>();
        map.put(FullName,StudentNumber);
        map2.put(FullName, AvgScore);
        System.out.println("Full name : "+ map.keySet());
        System.out.println("Student Number : "+map.values());
        System.out.println("Your average score : "+map2.values());
    }
}
