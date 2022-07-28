package abstractFactoryPattern.me;

public class Person {

    private final PhoneFactory phoneFactory;

    public Person(PhoneFactory phoneFactory) {
        this.phoneFactory = phoneFactory;
    }

    public Phone buy(PersonType personType) {
        Phone phone = null;

        if (PersonType.TEACHER == personType) {
            phone = new Phone();
            phone.setCompany(new AppleCompany());
            phone.setBattery(new AppleBattery());
            phone.setCamera(new AppleCamera());
        }
        if (PersonType.STUDENT == personType) {
            phone = new Phone();
            phone.setCompany(new SamsungCompany());
            phone.setBattery(new SamsungBattery());
            phone.setCamera(new SamsungCamera());
        }
        return phone;
    }
}
