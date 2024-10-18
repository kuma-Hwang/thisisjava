package ch02.sec12;

//변수의 자리수 설정 이해
//2024.10.02

public class Test {
    public static void main(String[] args) {

        //초기값
        String name = "황승현";
        int age = 94;
        String posi = "기흥";
        int preAge = 8;
        double myRate = 23.4527;

        //println 과 printf 차이 비교
        System.out.println("이름: " + name + ", 나이: "+ age + ", 사는 곳:"+ posi);
        System.out.printf("이름: %s ,나이: %d ,사는곳 :%s \n",  name, age, posi);


        // 수를 표시할 때 자리수 지정
        System.out.println("현재나이: " + age);
        System.out.println("이전나이: " + preAge);

        System.out.printf("현재나이: %2d\n", age);
        System.out.printf("이전나이: %2d\n", preAge);

        // 소수점 자리 올림 확인
        System.out.println("나의 실적율: "+ myRate);
        System.out.printf("나의 실적율 %10.2f: ", myRate);

    }

    }
