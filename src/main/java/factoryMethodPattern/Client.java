package factoryMethodPattern;

public class Client {
    public static void main(String[] args) {
        SmartPhoneFactory factory = new SmartPhoneFactory();
        factory.createBattery(SmartPhoneType.APPLE);
        factory.createCamera(SmartPhoneType.APPLE);

        factory.createBattery(SmartPhoneType.SAMSUNG);
        factory.createCamera(SmartPhoneType.SAMSUNG);
    }
}
