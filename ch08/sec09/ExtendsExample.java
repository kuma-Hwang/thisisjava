package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ia.methodA();
        ib.methodB();
        ic.methodC();

    }
}
