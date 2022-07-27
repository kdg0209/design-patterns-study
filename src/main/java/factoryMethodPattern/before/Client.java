package factoryMethodPattern.before;

public class Client {
    public static void main(String[] args) {
        Ship WhiteShip = ShipFactory.createShip("WhiteShip", "홍길동");
        System.out.println(WhiteShip);
        // WhiteShip 만들 준비 중
        // 홍길동님 WhiteShip 다 만들었습니다.
        // Ship(name=WhiteShip, color=white)

        Ship BlackShip = ShipFactory.createShip("BlackShip", "이순신");
        System.out.println(BlackShip);
        // BlackShip 만들 준비 중
        // 이순신님 BlackShip 다 만들었습니다.
        // Ship(name=BlackShip, color=black)
    }
}
