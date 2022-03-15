package factoryMethodPattern;

public class SmartPhoneFactory extends SmartPhone {

    @Override
    public Battery createBattery(SmartPhoneType type) {
        Battery battery = null;

        switch (type) {
            case APPLE:
                battery = new AppleBattery();
                break;
            case SAMSUNG:
                battery = new SamsungBattery();
                break;
        }

        return battery;
    }

    @Override
    public Camera createCamera(SmartPhoneType type) {
        Camera camera = null;
        switch (type) {
            case APPLE:
                camera = new AppleCamera();
                break;
            case SAMSUNG:
                camera = new SamsungCamera();
                break;
        }
        return camera;
    }
}
