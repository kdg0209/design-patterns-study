package singletonPattern;

public class Outer {

    // static 변수 선언
    public static String TEST01 = "TEST01";

    // Outer 클래스의 static 블록
    static {
        System.out.println("1 - Outer class 초기화, TEST01 = " + TEST01);
        TEST01 = "This is TEST01";
    }

    // Inner 클래스
    public static class Inner {

        // Inner 클래스의 static 블록
        static {
            System.out.println("4 - Inner class 초기화");
        }

        // Inner 클래스의 static 메서드
        public static String info() {
            return "Inner Class info Method Call";
        }
    }
}
