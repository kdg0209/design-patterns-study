package factoryMethodPattern;

public class SamsungCamera extends Camera {

    @Override
    public void snapShot() {
        System.out.println("10배속으로 찍기");
    }
}
