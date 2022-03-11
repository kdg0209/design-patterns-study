package decoratorPattern;

public class Car extends Component{

    @Override
    public void start() {
        System.out.println("앞으로 출발합니다.");
    }

    @Override
    public void stop() {
        System.out.println("멈춥니다.");
    }

    @Override
    public void back() {
        System.out.println("후진합니다.");
    }
}
