package factoryMethodPattern.after;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship creatingShip() {
        return new WhiteShip();
    }
}
