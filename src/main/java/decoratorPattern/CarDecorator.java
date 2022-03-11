package decoratorPattern;

public class CarDecorator extends Component{

    private Component component;

    public CarDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void start() {
        component.start();
    }

    @Override
    public void stop() {
        component.stop();
    }

    @Override
    public void back() {
        component.back();
    }
}
