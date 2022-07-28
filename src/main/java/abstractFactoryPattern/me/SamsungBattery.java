package abstractFactoryPattern.me;

public class SamsungBattery implements Battery {

    @Override
    public void power() {
        System.out.println("SamsungBattery 성능");
    }
}
