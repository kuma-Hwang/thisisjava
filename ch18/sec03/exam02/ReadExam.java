package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/Temp/test2.db");

            byte[] data = new byte[100];

            while (true) {
                int num = is.read();
                if(num == -1) break;
                System.out.println(data);
            }

            is.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
