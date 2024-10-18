package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton();   //에러
        Singleton obj2 = new Singleton();   //에러

         */

        //할당받아야 함
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        //동일한 객체를 참조하는지 확인하기
        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
