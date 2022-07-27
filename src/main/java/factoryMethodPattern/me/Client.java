package factoryMethodPattern.me;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = new DefaultFactory().creatingShip(Type.WHITE_SHIP, "멋쟁이배", "white", "홍길동");
        System.out.println(whiteShip);
        // 멋쟁이배 만들 준비 중
        // 홍길동님 멋쟁이배 다 만들었습니다.
        // Ship(name=멋쟁이배, color=white)

        Ship blackShip = new DefaultFactory().creatingShip(Type.BLACK_SHIP, "빠른배", "black", "이순신");
        System.out.println(blackShip);
        // 빠른배 만들 준비 중
        // 이순신님 빠른배 다 만들었습니다.
        // Ship(name=빠른배, color=black)
    }
}
