package abstractFactoryPattern.me;

public class SamsungFactory implements PhoneFactory {


    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }
}
