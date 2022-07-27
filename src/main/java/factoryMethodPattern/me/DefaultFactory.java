package factoryMethodPattern.me;

public class DefaultFactory implements ShipFactory {

    @Override
    public Ship creatingShip(Type type, String name, String color, String buyer) {
        validate(name, buyer);
        prepareFor(name);

        Ship ship = null;
        switch (type) {
            case BLACK_SHIP:
                ship = new BlackShip(name, color);
                break;
            case WHITE_SHIP:
                ship = new WhiteShip(name, color);
                break;
            default:
                throw new RuntimeException(type.toString() + " is not existed");
        }
        sendAlarmTo(buyer, ship);
        return ship;
    }

    private void validate(String name, String buyer) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (buyer == null || buyer.isBlank()) {
            throw new IllegalArgumentException("구매자를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private void sendAlarmTo(String buyer, Ship ship) {
        System.out.println(buyer + "님 " + ship.getName() + " 다 만들었습니다.");
    }
}
