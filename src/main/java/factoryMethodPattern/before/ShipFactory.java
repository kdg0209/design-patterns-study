package factoryMethodPattern.before;

public class ShipFactory {

    public static Ship createShip(String name, String buyer) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (buyer == null || buyer.isBlank()) {
            throw new IllegalArgumentException("구매자를 남겨주세요.");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("whiteShip")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackShip")) {
            ship.setColor("black");
        }

        sendAlarmTo(buyer, ship);
        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendAlarmTo(String buyer, Ship ship) {
        System.out.println(buyer + "님 " + ship.getName() + " 다 만들었습니다.");
    }
}
