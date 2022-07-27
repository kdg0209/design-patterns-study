package factoryMethodPattern.after;

public interface ShipFactory {

    Ship creatingShip();

    default Ship orderShip(String name, String buyer) {
        validate(name, buyer);
        prepareFor(name);
        Ship ship = creatingShip();
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
