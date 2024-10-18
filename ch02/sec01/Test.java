package ch02.sec01;

public class Test {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = 2147483647;
        System.out.println("a= "+ a +" b= " +b);


        long c = a + (long)b;
        System.out.println("c=" + c);
    }
}
