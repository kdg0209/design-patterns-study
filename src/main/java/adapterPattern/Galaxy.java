package adapterPattern;

public class Galaxy implements SamsungProduct {

    @Override
    public void charging(String name) {
        System.out.println(name + " 제품을 충전중입니다.");
    }

    @Override
    public void playExecl(String name) {
        System.out.println(name + "파일을 실행시킵니다.");
    }

    @Override
    public void playPowerpoint(String name) {
        System.out.println(name + "파일을 실행시킵니다.");
    }
}
