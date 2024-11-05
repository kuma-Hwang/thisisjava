package ch17.sec02;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class ParallelWStreamExam {
    public static void main(String[] args) {
        //list 컬렉션 생성
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("람다식");
        list.add("박병렬");

        //병렬처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(name -> { System.out.println(name + ":" +Thread.currentThread().getName());
        });
    }
}
