public class Info {
    private String fullname;
    private String username;
    private String password;
    private int age;
   /* private Info(Fullname fullname, Username username, Password password, Age age) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.age = age;
    }  */
    private Info(){}
    private static Info info = new Info();
    public static Info getInstance(){
        return info;
    }
    public void create(String name , String uname,String pword,int age) {
        setAge(age);
        setFullname(name);
        setUsername(uname);
        setPassword(pword);
    }


    public void show(){
        System.out.println("Name : "+getFullname());
        System.out.println("Username : "+getUsername());
        System.out.println("Password : "+getPassword());
        System.out.println("Age : "+getAge());
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Info getInfo() {
        return info;
    }

    public static void setInfo(Info info) {
        Info.info = info;
    }
}
