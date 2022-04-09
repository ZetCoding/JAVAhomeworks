package UserInformation;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main extends UserInfoBuilder{
    public static void main(String[] args) {
        UserInfoBuilder<String,String,String,Integer,String,String,String> obj = new UserInfoBuilder<String,String,String,Integer
                ,String,String,String>();
            File myFile = new File("C:\\Users\\user\\Desktop\\JavaCodes\\L5-Design Patterns\\tamrin1\\" +
                    "src\\UserInformation\\UserInfo.txt");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter username : ");
        String u = input.next();
        obj.setUsername(u);
        System.out.print("Enter your full name : ");
        String fn = input.next();
        obj.setFullName(fn);
        System.out.print("Enter your password : ");
        String p = input2.next();
        obj.setPassWord(p);
        System.out.print("Enter your age : ");
        int a = input2.nextInt();
        obj.setAge(a);
        System.out.print("Enter your address : ");
        String adrs = input2.next();
        obj.setAddress(adrs);
        System.out.print("Enter your phone number : ");
        String phn = input3.next();
        obj.setPhoneNumber(phn);
        System.out.print("Enter your educational level : ");
        String el = input4.next();
        obj.setEducationLevel(el);
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred!!");
            e.printStackTrace();
        }
        try {
            FileWriter fileWriter = new FileWriter(myFile);
            fileWriter.write("Username : "+u+"\nFull name : "+fn+"\nPassword : "+p+"\nAge : "+a+"\nAddress : "+adrs+"\nPhone number : "+phn+
                    "\nEducational level : "+el);
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        //=======================
        try {
            FileReader fileReader = new FileReader(myFile);
            int ASCII = fileReader.read();
            String i="";

            while (ASCII!=-1)
            {
                i=i+(char) ASCII;
                ASCII = fileReader.read();
            }
            fileReader.close();
            System.out.println(i);
        } catch (IOException e) {
            e.printStackTrace ();
        }


    }
}
