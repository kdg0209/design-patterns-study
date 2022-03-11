package decoratorPattern;

public class SportCar extends CarDecorator{

    public SportCar(Component component) {
        super(component);
    }

    @Override
    public void start() {
        super.start();
        speed();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void back() {
        super.back();
    }

    public void speed() {
        System.out.println("속도를 높입니다.");
    }
}
