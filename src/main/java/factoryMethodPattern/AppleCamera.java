package factoryMethodPattern;

public class AppleCamera implements Camera {

    @Override
    public void snapShot() {
        System.out.println("20배속으로 찍기");
    }
}
