package factoryMethodPattern;

public class AppleBattery implements Battery {

    @Override
    public void power() {
        System.out.println("99% power");
    }
}
