package ch06.sec15;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton () {          //생성사 선언
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
