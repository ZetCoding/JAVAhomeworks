import java.io.FileWriter;
import java.io.IOException;

public class MySecondThread extends MyThread implements Runnable{
    @Override
    public void run(){
            try {
                FileWriter myWriter = new FileWriter("C:\\Users\\user\\Desktop\\JavaCodes\\L9-Thread\\classi\\src\\FileForWriting.txt");
                myWriter.write(content);
                System.out.println(content);
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

    }
}
