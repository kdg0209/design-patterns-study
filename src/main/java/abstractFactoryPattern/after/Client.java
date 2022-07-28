package abstractFactoryPattern.after;

public class Client {
    public static void main(String[] args) {

        CreatorFactory proFactory = new CreatorFactory(new ProFactory());
        Ship proShip = proFactory.createShip();
        System.out.println(proShip.getWheel().getClass());
        System.out.println(proShip.getAnchor().getClass());

        CreatorFactory defaultFactory = new CreatorFactory(new DefaultFactory());
        Ship defaultShip = defaultFactory.createShip();
        System.out.println(defaultShip.getWheel().getClass());
        System.out.println(defaultShip.getAnchor().getClass());
    }
}
