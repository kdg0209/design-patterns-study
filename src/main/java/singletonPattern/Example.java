package singletonPattern;

public class Example {
    public static void main(String[] args) {
        System.out.println("2 - TEST01             --> " + Outer.TEST01);
        System.out.println("3 - Outer.Inner.class  --> " + Outer.Inner.class);
        System.out.println("5 - Outer.Inner.info() --> " + Outer.Inner.info());

    }
}
