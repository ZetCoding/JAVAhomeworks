import java.util.List;
import java.util.Scanner;
import Model.Entity.*;
import Model.Service.*;
public class Main {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        InfoEntityBuilder obj = new InfoEntityBuilder();
        System.out.print("Enter your name : ");
        String n = input1.next();
        obj.setName(n);
        System.out.print("Enter your username : ");
        String u = input2.next();
        obj.setUsername(u);
        System.out.print("Enter your password : ");
        String p = input2.next();
        obj.setPassword(p);
        System.out.print("Enter your email : ");
        String em = input3.next();
        obj.setEmail(em);

        //insert
        try {
            InfoSer.getInstance ().save (new InfoEntityBuilder ().setName (obj.getName()).setUsername (obj.getUsername())
                    .setPassword (obj.getPassword()).setEmail (obj.getEmail()));
            System.out.println ("saved successfully");
        }
        catch (Exception e){
            System.out.println ("Fail to save!"+e.getMessage ());
        }

        //update
        try {
            InfoSer.getInstance ().edit (new InfoEntityBuilder ().setUsername("belfi13").setPassword("138181"));
            System.out.println ("edited successfully");
        }
        catch (Exception e){
            System.out.println ("Fail to edit!"+e.getMessage ());

        }
        //delete
        try {
            InfoSer.getInstance ().remove (obj.getEmail());
            System.out.println ("removed successfully");
        }
        catch (Exception e){
            System.out.println ("Fail to delete!"+e.getMessage ());
        }
        //select
        try {
            List<InfoEntityBuilder> infoEntityBuilderList = InfoSer.getInstance().report ();
            for (InfoEntityBuilder infoEntityBuilder : infoEntityBuilderList) {
                System.out.println(infoEntityBuilder.getName());
                System.out.println(infoEntityBuilder.getUsername());
                System.out.println(infoEntityBuilder.getPassword());
                System.out.println(infoEntityBuilder.getEmail());
            }
        }
        catch (Exception e){
            System.out.println ("Fail to report!"+e.getMessage ());
        }
    }
}
