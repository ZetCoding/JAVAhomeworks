import java.util.Scanner;
import java.sql.*;

public class Main extends StudentInfo {
    public static void main(String[] args) {
        StudentInfo obj = new StudentInfo();
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);

        System.out.print("Enter your code : ");
        String c = input1.nextLine();
        obj.setCode(c);
        System.out.print("Enter your name : ");
        String n = input2.nextLine();
        obj.setName(n);
        System.out.print("Enter the year you accepted : ");
        int y = input3.nextInt();
        obj.setYear(y);
        System.out.print("Enter your average score : ");
        double a = input4.nextDouble();
        obj.setAvg(a);

        try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##ex2","myjava")){
            PreparedStatement preparedStatement1 = connection.prepareStatement("insert into student(code,name,year,avg) values (?,?,?,?)");
preparedStatement1.setString(1,obj.getCode());
preparedStatement1.setString(2,obj.getName());
preparedStatement1.setLong(3,obj.getYear());
preparedStatement1.setDouble(4,obj.getAvg());
            System.out.println("Insert into Database for user1 : "+preparedStatement1.executeUpdate());
            PreparedStatement preparedStatement2 = connection.prepareStatement("insert into student(code,name,year,avg) values (?,?,?,?)");
preparedStatement2.setString(1,"1234567");
preparedStatement2.setString(2,"sina");
preparedStatement2.setLong(3,1399);
preparedStatement2.setDouble(4,18.83);
            System.out.println("Insert into Database for user2(was saved in database and cannot be updated) : "
                    +preparedStatement2.executeUpdate());
            System.out.println("select  :  1.update user1   2.delete user1   3.delete user2   4.exit");

            String i = input5.next();
            switch (i){
                case "1" :{
                    PreparedStatement preparedStatement3 = connection.prepareStatement("update student set avg=?  WHERE code=?");
                    preparedStatement3.setDouble(1,19.3);
                    preparedStatement3.setString(2, obj.getCode());
                    System.out.println("user1 updated : "+preparedStatement3.executeUpdate());
                    break;}
                case "2":{
                    PreparedStatement preparedStatement4 = connection.prepareStatement("delete from student where code=?");
                    preparedStatement4.setString(1,obj.getCode());
                    System.out.println("Deleted from Database : " +preparedStatement4.executeUpdate());
                    break;}
                case "3":{
                    PreparedStatement preparedStatement5 = connection.prepareStatement("delete from student where code=?");
                    preparedStatement5.setString(1,"1234567");
                    System.out.println("Deleted from Database : " +preparedStatement5.executeUpdate());
                    break;}
                case "4":
                    break;
                default:
                    System.out.println("you had to enter an number from 1 to 4!!!!");

            }

        }catch (SQLException e){
            System.out.println("Database Error : "+e.getMessage());
        }



    }
}
