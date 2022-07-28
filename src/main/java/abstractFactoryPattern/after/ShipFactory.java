package abstractFactoryPattern.after;


public interface ShipFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
