package ch07.sec02;

public class SmartPhone extends Phone{

    public boolean wifi; //초기값을 등록해야하는 것이 맞음.

    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet () {
        System.out.println("인터넷에 연결합니다.");
    }
}
