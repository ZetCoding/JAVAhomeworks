

public class Identity extends Exception {
    protected static String fullName;
    protected static String userName;
    protected static String password;

    public Identity(String msg) {
        super(msg);
    }
    public Identity(String fullName , String userName , String password){
        this.fullName=fullName;
        this.userName=userName;
        this.password=password;
    }
    protected void diagnosis(String a,String b,String c) throws Identity{
        if ((!a.equals(fullName)&& a!=null) || (!b.equals(userName)&&b!=null) || (!c.equals(password)&&c!=null))
            throw new Identity("Invalid information!");
        else
            System.out.println("You are logged in");
    }
}