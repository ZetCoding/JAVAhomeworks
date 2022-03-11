
public class Information extends Exception{
    protected static String firstName;
    protected static String lastName;
    protected static int age;
    protected Information(String msg){
        super(msg);
    }
    protected Information(String firstName, String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    protected Information(){}
    protected static void method1(String a, String b , int c) throws Information{
        if(a.equals(firstName)&& b.equals(lastName) && c==age)
            throw new Information("Error! this user already exists!");
        else
            System.out.println("Registration was successful");
    }
}
