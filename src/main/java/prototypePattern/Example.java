package prototypePattern;

public class Example {
    public static void main(String[] args) {
        SmartPhoneStore smartPhoneStore = new SmartPhoneStore();
        smartPhoneStore.save(Person.APPLE);
        smartPhoneStore.save(Person.SAMSUNG);

        SmartPhone apple = smartPhoneStore.buy(Person.APPLE);
        SmartPhone copyApple = apple; // 얕은 복사
        SmartPhone deepApple = smartPhoneStore.buy(Person.APPLE); // 깊은 복사
        SmartPhone samsung = smartPhoneStore.buy(Person.SAMSUNG);

        apple.initBattery("100% 효율");
        apple.initCpu("M1 cpu");

        samsung.initBattery("100% 효율");
        samsung.initCpu("Intel cpu");

        System.out.println("apple.hashCode() = " + apple.hashCode());
        System.out.println("copyApple.hashCode() = " + copyApple.hashCode());
        System.out.println("deepApple.hashCode() = " + deepApple.hashCode());
        System.out.println("samsung.hashCode() = " + samsung.hashCode());

    }
}
