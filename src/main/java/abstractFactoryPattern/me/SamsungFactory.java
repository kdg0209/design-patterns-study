package abstractFactoryPattern.me;

public class SamsungFactory implements PhoneFactory {

    @Override
    public Company createCompany(Company company) {
        return new SamsungCompany();
    }

    @Override
    public Battery createBattery() {
        return new SamsungBattery();
    }

    @Override
    public Camera createCamera() {
        return new SamsungCamera();
    }
}
