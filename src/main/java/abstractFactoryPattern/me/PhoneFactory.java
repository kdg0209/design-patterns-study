package abstractFactoryPattern.me;

public interface PhoneFactory {

    Company createCompany(Company company);
    Battery createBattery();
    Camera createCamera();
}
