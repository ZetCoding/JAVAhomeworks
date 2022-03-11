import java.util.ArrayList;

public class Operative extends Exception {
  protected String userInput;
  protected static int i;
 // protected  static ArrayList<Character> numbers = new ArrayList<Character>();

  protected Operative(String msg){
      super(msg);
  }
  protected Operative(){}
    protected static void method1(String a) throws Operative {
      char[] chars = a.toCharArray();
      StringBuilder sb = new StringBuilder();
      for(char c : chars){
        if(Character.isDigit(c)){
          sb.append(c);
        }
      }
      if (!sb.isEmpty())
        throw new Operative("A number has been found!!");
      else
        System.out.println("No errors has been found");
    }
}
