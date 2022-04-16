import java.util.Scanner;
import java.sql.*;


public class Main extends Info {
    public static void main(String[] args) {
        boolean wow = true;
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Info obj = new Info();
        System.out.print("Enter your name : ");
        String n = input1.next();
        obj.setFullname(n);
        System.out.print("Enter your username : ");
        String u = input2.next();
        obj.setUsername(u);
        System.out.print("Enter your password : ");
        String p = input2.next();
        obj.setPassword(p);
        System.out.print("Enter your email : ");
        String em = input3.next();
        obj.setEmail(em);

        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##classi", "java123")) {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into myInfo(name,username,password,email) values (?,?,?,?)");
            preparedStatement.setString(1, obj.getFullname());
            preparedStatement.setString(2, obj.getUsername());
            preparedStatement.setString(3, obj.getPassword());
            preparedStatement.setString(4, obj.getEmail());
            System.out.println("Inter into Database" + preparedStatement.executeUpdate());
        } catch (SQLException e) {
            System.out.println("Database Error!" + e.getMessage());
        }
        while(wow) {
            System.out.print("Enter your username to login : ");
            Scanner input4 = new Scanner(System.in);
            String uLogin = input4.next();
            System.out.print("Enter your password : ");
            String pLogin = input4.next();
            if (uLogin.equals(obj.getUsername()) && pLogin.equals(obj.getPassword())) {
                System.out.print("Login successfully!");
                wow = false;
            } else
                System.out.println("Username or password was wrong!!   try again.");
        }

    }
}

