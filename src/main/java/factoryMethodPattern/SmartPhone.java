package factoryMethodPattern;

public interface SmartPhone {

    Battery createBattery(SmartPhoneType type);
    Camera createCamera(SmartPhoneType type);
}
