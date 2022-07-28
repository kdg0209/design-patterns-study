package abstractFactoryPattern.me;

public class AppleCamera implements Camera {

    @Override
    public void power() {
        System.out.println("AppleCamera 성능");
    }
}
