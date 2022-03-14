package factoryMethodPattern;

public class SamsungBattery implements Battery {

    @Override
    public void power() {
        System.out.println("100% power");
    }
}
