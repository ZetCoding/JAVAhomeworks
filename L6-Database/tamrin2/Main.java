import java.util.Scanner;
import java.sql.*;

public class Main extends EmployeeInfo {
    public static void main(String[] args) {
        EmployeeInfo obj = new EmployeeInfo();
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        System.out.println("Your UNIQUE ID is : "+obj.uniqueID(1));
      //  int i = input1.nextInt();
     //   obj.setCodeID(i);
        System.out.print("Enter your name : ");
        String n = input1.nextLine();
        obj.setName(n);
        System.out.print("Enter your milli code : ");
        String mcode = input2.next();
        obj.setMilliCod(mcode);
        System.out.print("Enter your father's name : ");
        String f = input2.next();
        obj.setFathername(f);
        System.out.print("Enter your current post : ");
        String p = input3.next();
        obj.setCurrentPost(p);
        System.out.print("Enter your earning : ");
        String s = input3.next();
        obj.setEarning(s);
        System.out.print("Enter your job resume : ");
        String r = input4.next();
        obj.setResume(r);

        try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##ex2","myjava")){
            PreparedStatement preparedStatement = connection.prepareStatement("insert into myinfo(id,name,milli,fathername,post,earning,resume) values" +
                    "(?,?,?,?,?,?,?)");
            preparedStatement.setLong(1,1);
            preparedStatement.setString(2,obj.getName());
            preparedStatement.setString(3,obj.getMilliCod());
            preparedStatement.setString(4,obj.getFathername());
            preparedStatement.setString(5,obj.getCurrentPost());
            preparedStatement.setString(6,obj.getEarning());
            preparedStatement.setString(7,obj.getResume());
            System.out.println("Insert into Database for user 1 : "+preparedStatement.executeUpdate());

            PreparedStatement preparedStatement2 = connection.prepareStatement("insert into myinfo(id,name,milli,fathername,post,earning,resume) values" +
                    "(?,?,?,?,?,?,?)");
            preparedStatement.setLong(1,2);
            preparedStatement.setString(2,"mohammad sina");
            preparedStatement.setString(3,"12345678");
            preparedStatement.setString(4,"morteza");
            preparedStatement.setString(5,"moaven vazir");
            preparedStatement.setString(6,"20,000,000 toman");
            preparedStatement.setString(7,"bedoone resume");
            System.out.println("Insert into Database for user 2 : "+preparedStatement.executeUpdate());
//   delete from Database :
            System.out.print("Enter ID to delete the information from database (User1 or user2) : ");
            int q = input5.nextInt();
            switch (q){
                case 1 :
                    PreparedStatement preparedStatement3 = connection.prepareStatement("Delete from myinfo where id=1");
                    System.out.println("User 1 deleted!"+preparedStatement3.executeUpdate());
                    break;
                case 2 :
                    PreparedStatement preparedStatement4 = connection.prepareStatement("Delete from myinfo where id=2");
                    System.out.println("User 2 deleted!"+preparedStatement4.executeUpdate());
                    break;
                default:
                    System.out.println("No Id found!");
            }


        }catch (SQLException e){
            System.out.print("Database Error : "+e.getMessage());
        }





    }
}
