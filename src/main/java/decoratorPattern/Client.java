package decoratorPattern;

public class Client {
    public static void main(String[] args) {
        Component car = new Car();
        car.stop(); // 멈춥니다.

        Component busCar = new BusCar(new Car());
        busCar.stop(); // 멈춥니다. + 사람들이 버스에 탑승합니다.

        Component truckCar = new TruckCar(new Car());
        truckCar.stop(); // 멈춥니다. + 트럭에 짐을 실습니다.

        Component sportCar = new SportCar(new Car());
        sportCar.start(); // 앞으로 출발합니다. + 속도를 높입니다.
    }
}
