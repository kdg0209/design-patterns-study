package prototypePattern;

public interface SmartPhone extends Cloneable{

    void initBattery(String text);
    void initCpu(String text);
    SmartPhone createClone();
}
