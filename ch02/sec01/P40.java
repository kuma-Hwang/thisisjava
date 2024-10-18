//숫자 변환식 temp 변수 사용

package ch02.sec01;

public class P40 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);

        int temp = x;
        x = y;
        y= temp;
        System.out.println("x:" + x + ", y:" + y);
    }
}
