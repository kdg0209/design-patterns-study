package factoryMethodPattern;

public class Client {
    public static void main(String[] args) {
        SmartPhoneFactory factory = new SmartPhoneFactory();
        Battery appleBattery = factory.createBattery(SmartPhoneType.APPLE);
        Camera appleCamera = factory.createCamera(SmartPhoneType.APPLE);
        appleBattery.power();
        appleCamera.snapShot();

        Battery samsungBattery = factory.createBattery(SmartPhoneType.SAMSUNG);
        Camera samsungCamera = factory.createCamera(SmartPhoneType.SAMSUNG);
        samsungBattery.power();
        samsungCamera.snapShot();
    }
}
