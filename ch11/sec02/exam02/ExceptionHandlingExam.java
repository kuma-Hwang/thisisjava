package ch11.sec02.exam02;

public class ExceptionHandlingExam {
    public static void  main(String [] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();   //에러에 관한 메세지를 노출
        }

        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 클래스가 존재합니다.");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
