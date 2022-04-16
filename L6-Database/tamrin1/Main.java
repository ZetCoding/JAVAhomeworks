
import java.sql.*;
import java.util.Scanner;

public class Main extends Information {
    public static void main(String[] args) {
        Information obj = new Information();
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter your ID which is a number : ");
        int idNum = input1.nextInt();
        obj.setId(idNum);
        System.out.print("Enter your username ( 20 characters at max ) : ");
        String uname = input1.next();
        obj.setUsername(uname);
        System.out.print("Enter your E-mail ( 60 characters at max ) : ");
        String mail = input2.next();
        obj.setEmail(mail);
        System.out.print("Enter your password ( 10 characters at max ) : ");
        String pword = input2.next();
        obj.setPassword(pword);
        System.out.print("Enter your age : ");
        int a = input3.nextInt();
        obj.setAge(a);
        System.out.print("Enter your education level ( 40 characters at max ) : ");
        String edu = input4.next();
        obj.setEducation(edu);

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##arshia",
                "myjava123")) {
            PreparedStatement preparedStatement1 = connection.prepareStatement("insert into information (id,username,email," +
                    "password,age,education) values (?,?,?,?,?,?)");
            preparedStatement1.setLong(1,obj.getId());
            preparedStatement1.setString(2,obj.getUsername());
            preparedStatement1.setString(3,obj.getEmail());
            preparedStatement1.setString(4,obj.getPassword());
            preparedStatement1.setLong(5,obj.getAge());
            preparedStatement1.setString(6,obj.getEducation());
            System.out.println ("Insert into DB: "+preparedStatement1.executeUpdate());

             //         ghesmate update kardane information ro comment kardam  !!!!!!!!!!!!!!!!!!!!!!
            /*
PreparedStatement preparedStatement2 = connection.prepareStatement("update information set id,username,email,password,age,education=? " +
        "WHERE id=? and username=? and email=? and password=? and age=? and education=?");
preparedStatement2.setLong(1,23);
preparedStatement2.setString(2,"Updated Username");
preparedStatement2.setString(3,"Updated Email");
preparedStatement2.setString(4,"Updated password");
preparedStatement2.setLong(5,21);
preparedStatement2.setString(6,"Updated education level");
            System.out.println ("Update inside DB: "+preparedStatement2.executeUpdate());  */

        } catch (SQLException e){
            System.out.println("Database Error!"+ e.getMessage());
        }

    }
}
