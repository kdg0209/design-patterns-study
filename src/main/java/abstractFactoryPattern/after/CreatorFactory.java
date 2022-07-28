package abstractFactoryPattern.after;

public class CreatorFactory {

    private final ShipFactory shipFactory;

    public CreatorFactory(ShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor(shipFactory.createAnchor());
        ship.setWheel(shipFactory.createWheel());
        return ship;
    }
}
