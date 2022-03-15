package factoryMethodPattern;

public class AppleCamera extends Camera {

    @Override
    public void snapShot() {
        System.out.println("20배속으로 찍기");
    }
}
