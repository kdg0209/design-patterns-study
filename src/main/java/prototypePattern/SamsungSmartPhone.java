package prototypePattern;

public class SamsungSmartPhone implements SmartPhone{

    @Override
    public void initBattery(String text) {
        System.out.println("삼성 휴대폰 배터리의 효율 " + text);
    }

    @Override
    public void initCpu(String text) {
        System.out.println("삼성 휴대폰 cpu의 효율 " + text);
    }

    @Override
    public SmartPhone createClone() {
        SmartPhone smartPhone = null;

        try {
            smartPhone = (SmartPhone) clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return smartPhone;
    }
}
