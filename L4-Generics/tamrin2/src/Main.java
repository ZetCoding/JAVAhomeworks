import java.util.Scanner;

public class Main extends Person{

    public static void main(String[] args) {

        System.out.print("Enter your full name : ");
        Scanner input = new Scanner(System.in);
        String myName = input.nextLine();
        System.out.print("Enter your E-mail : ");
        String myMail = input.nextLine();
        System.out.print("Enter your age : ");
        int myAge = input.nextInt();
        Person<String,String,Integer> user_data =
                new Person<String,String,Integer>(myName,myMail,myAge);
        Person p1 = null;
        Person p2 = null;
        Person p3 = null;

        try {
            p1 = (Person) user_data.clone();
            p2 = (Person) user_data.clone();
            p3 = (Person) user_data.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("there was an error while cloning!!");
        }
        if (!user_data.equals(p1)||!user_data.equals(p2)||!user_data.equals(p3)){
            System.out.println(user_data);
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
        }
    }
}
