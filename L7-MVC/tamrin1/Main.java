import Model.Entity.Entity;
import Model.Service.Service;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Entity obj = new Entity();
        System.out.print("Enter your username : ");
        String n = input1.next();
        System.out.print("Enter your password : ");
        String u = input2.next();
       try {
            List<Entity> myList = Service.getInstance().report ();
            for (Entity enti : myList) {
                System.out.println(enti.getId());
                System.out.println(enti.getHajm()+" GB");
                System.out.println(enti.getPrice());
                System.out.println("5.Exit");
            }
        }
        catch (Exception e){
            System.out.println ("Fail to report!"+e.getMessage ());
        }

        System.out.print("Select one of the options(you must select the ID) : ");
        int l = input3.nextInt();

        switch (l){
            case 1:{
                try {
                    Service.getInstance ().save (new Entity ().setMyHajm(obj.getMyHajm()+obj.getHajm()).setAttempts(obj.getAttempts()+1));
                    System.out.println ("saved successfully");
                }
                catch (Exception e){
                    System.out.println ("Fail to save!"+e.getMessage ());
                }
                break;
            }
            case 2:{
                try {
                    Service.getInstance ().save (new Entity ().setMyHajm(obj.getMyHajm()+obj.getHajm()).setAttempts(obj.getAttempts()+1));
                    System.out.println ("saved successfully");
                }
                catch (Exception e){
                    System.out.println ("Fail to save!"+e.getMessage ());
                }
                break;
            }
            case 3:{
                try {
                    Service.getInstance ().save (new Entity ().setMyHajm(obj.getMyHajm()+obj.getHajm()).setAttempts(obj.getAttempts()+1));
                    System.out.println ("saved successfully");
                }
                catch (Exception e){
                    System.out.println ("Fail to save!"+e.getMessage ());
                }
                break;
            }
            case 4:{
                try {
                    Service.getInstance ().save (new Entity ().setMyHajm(obj.getMyHajm()+obj.getHajm()).setAttempts(obj.getAttempts()+1));
                    System.out.println ("saved successfully");
                }
                catch (Exception e){
                    System.out.println ("Fail to save!"+e.getMessage ());
                }
                break;
            }
            case 5 :
                break;
            default:
                System.out.println("Enter the IDs!!");
        }
    }
}
