package compositePattern;

public class Client {
    public static void main(String[] args) {
        SmartPhoneDevice battery = new Battery(100000, 50);
        SmartPhoneDevice storageCapacity = new StorageCapacity(150000, 60);
        SmartPhoneDevice flash = new Flash(200000, 80);
        SmartPhoneDevice camera = new Camera(300000, 80);
        SmartPhoneDevice speaker = new Speaker(500000, 80);

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.addComponent(battery);
        smartPhone.addComponent(storageCapacity);
        smartPhone.addComponent(flash);
        smartPhone.addComponent(camera);
        smartPhone.addComponent(speaker);

        int smartPhonePrice = smartPhone.getPrice();
        int smartPhonePower = smartPhone.getPower();

        System.out.println("SmartPhone Price = " + smartPhonePrice + "원");
        // SmartPhone Price = 1250000원
        System.out.println("SmartPhone Power = " + smartPhonePower + "W");
        // SmartPhone Power = 350W
    }
}
