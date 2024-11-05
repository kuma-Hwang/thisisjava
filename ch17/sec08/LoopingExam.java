package ch17.sec08;

import java.util.Arrays;

public class LoopingExam {
    public static void main(String[] args) {
        int [] intArr = {1,2,3,4,5};

        /*
        Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(n -> System.out.println(n)); //최종 처리가 없으므로 동작 x
                */

        //중간 처리 메소드 peek()을 이용해서 반복처리
        int total = Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(n -> System.out.println(n)) //동작함.
                .sum(); //최종처리
        System.out.println("총합 : " + total + "\n");

        //최종 처리 메소드 forEach()를 이용해서 반복 처리
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(n -> System.out.println(n));
    }
}
