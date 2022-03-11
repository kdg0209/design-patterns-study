package decoratorPattern;

public class BusCar extends CarDecorator{

    public BusCar(Component component) {
        super(component);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
        onTheBus();
    }

    @Override
    public void back() {
        super.back();
    }

    private void onTheBus() {
        System.out.println("사람들이 버스에 탑승합니다.");
    }
}
