package abstractFactoryPattern.me;

public class AppleFactory implements PhoneFactory {

    @Override
    public Company createCompany(Company company) {
        return new AppleCompany();
    }

    @Override
    public Battery createBattery() {
        return new AppleBattery();
    }

    @Override
    public Camera createCamera() {
        return new AppleCamera();
    }
}
