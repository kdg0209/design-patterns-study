package factoryMethodPattern.me;


public interface ShipFactory {

    Ship creatingShip(Type type, String name, String color, String buyer);
}
