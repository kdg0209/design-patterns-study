package abstractFactoryPattern.me;

public class AppleFactory implements PhoneFactory {

    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }
}
