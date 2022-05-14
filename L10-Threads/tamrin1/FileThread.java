import java.io.FileReader;
import java.io.IOException;

public class FileThread implements Runnable{

    @Override
    public void run() {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\user\\Desktop\\JavaCodes\\L10-Thread\\tamrin1\\src\\SomeText.txt");
            int ASCII = fileReader.read();
            String i="";

            while (ASCII!=-1)
            {
                i=i+(char) ASCII;
                ASCII = fileReader.read();
            }
            fileReader.close();
            System.out.println("\n ** Thread 3 is working : \n"+i);
        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}
