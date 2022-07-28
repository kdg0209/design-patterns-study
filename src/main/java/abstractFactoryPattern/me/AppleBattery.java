package abstractFactoryPattern.me;

public class AppleBattery implements Battery {

    @Override
    public void power() {
        System.out.println("AppleBattery 성능");
    }
}
