import java.io.*;
import java.nio.CharBuffer;
import java.util.Scanner;

public class MyThread implements Runnable {
     public char content;
    char[] array = new char[1000];

    @Override
            public void run() {
        try {
            FileReader fr = new FileReader(
                    "C:\\Users\\user\\Desktop\\JavaCodes\\L9-Thread\\classi\\src\\FileForReading.txt");
            int i;
            while ((i = fr.read()) != -1) {
             //   System.out.print((char) i);
                for (int k=0;(i = fr.read()) != -1 ;k++)
                    array[k]= (char) i;
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
