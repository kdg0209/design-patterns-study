package factoryMethodPattern;

public abstract class SmartPhone {
    abstract Battery createBattery(SmartPhoneType type);
    abstract Camera createCamera(SmartPhoneType type);
}
