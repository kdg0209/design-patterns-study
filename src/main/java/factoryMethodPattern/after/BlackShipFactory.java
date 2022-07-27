package factoryMethodPattern.after;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship creatingShip() {
        return new BlackShip();
    }
}
