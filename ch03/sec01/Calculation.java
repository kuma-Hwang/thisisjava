package ch03.sec01;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int a = stdIn.nextInt();

        System.out.print("두번째 숫자를 입력하세요: ");
        int b = stdIn.nextInt();

        System.out.println("a와 b를 더한 값은 :" + (a+b) );
        System.out.println("a와 b를 뺀 값은 :" + (a-b) );
        System.out.println("a와 b를 곱한 값은 :" + (a*b) );
        System.out.printf("a와 b를 나눈 값은 : %d / %d =%5.2f",a, b, ((float)a/b));


    }
}
