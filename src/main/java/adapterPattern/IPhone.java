package adapterPattern;

public class IPhone implements AppleProduct {

    @Override
    public void charging(String name) {
        System.out.println(name + " 제품을 충전중입니다.");
    }

    @Override
    public void playNumbers(String name) {
        System.out.println(name + "파일을 실행시킵니다.");
    }

    @Override
    public void playKeynote(String name) {
        System.out.println(name + "파일을 실행시킵니다.");
    }
}
