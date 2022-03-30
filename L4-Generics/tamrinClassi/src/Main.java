public class Main extends MyInfo{
    public static void main(String[] args) {
        MyInfo<String,String,Integer,String,String,String> information =
                new MyInfo<String,String,Integer,String,String,String>
                        ("Arshia","Yaghoubi",20,"arshia81","arshia1381","Student");

        System.out.println();
        System.out.println(information.getMyName());
        System.out.println(information.getMyFamily());
        System.out.println(information.getMyAge());
        System.out.println(information.getMyUser());
        System.out.println(information.getMyPass());
        System.out.println(information.getMuJob());
    }
}
