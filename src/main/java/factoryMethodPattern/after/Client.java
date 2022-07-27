package factoryMethodPattern.after;


public class Client {
    public static void main(String[] args) {
        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "홍길동");
        System.out.println(whiteShip);
        // WhiteShip 만들 준비 중
        // 홍길동님 WhiteShip 다 만들었습니다.
        // Ship(name=WhiteShip, color=White)

        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "이순신");
        System.out.println(blackShip);
        // BlackShip 만들 준비 중
        // 이순신님 BlackShip 다 만들었습니다.
        // Ship(name=BlackShip, color=Black)
    }
}
