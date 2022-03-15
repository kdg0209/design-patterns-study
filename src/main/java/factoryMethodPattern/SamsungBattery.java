package factoryMethodPattern;

public class SamsungBattery extends Battery {

    @Override
    public void power() {
        System.out.println("100% power");
    }
}
