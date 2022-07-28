package abstractFactoryPattern.me;

public class SamsungCamera implements Camera {

    @Override
    public void power() {
        System.out.println("SamsungCamera 성능");
    }
}
