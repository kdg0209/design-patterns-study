package decoratorPattern;

public class TruckCar extends CarDecorator{

    public TruckCar(Component component) {
        super(component);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
        load();
    }

    @Override
    public void back() {
        super.back();
    }

    private void load() {
        System.out.println("트럭에 짐을 실습니다.");
    }
}
