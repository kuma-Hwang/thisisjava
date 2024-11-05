package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExam {
    public static void main(String[] args) throws Exception {
        String originalFileName = "C:Temp/excel_data.xlsx";
        String targetFileName = "C:Temp/excel_data2.xlsx";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        byte[]data = new byte[1024];
        while (true) {
            int num = is.read(data);   //최대 1024 바이트를 읽고 배열에 저장. 읽은 바이트는 리턴
            if (num == -1) break;      //파일을 다 읽으면 while 문 종료
            os.write(data,0,num);  //읽은 바이트 수만큼 출력
        }

        os.flush();         //내부 버퍼 잔류 바이트를 출력하고 버퍼를 비움
        os.close();
        is.close();

        System.out.println("복사가 잘 되었습니다.");
    }
}
