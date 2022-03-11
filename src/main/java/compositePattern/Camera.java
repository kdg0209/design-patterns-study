package compositePattern;

public class Camera implements SmartPhoneDevice{
    private int price;
    private int power;

    public Camera(int price, int power) {
        this.price = price;
        this.power = power;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getPower() {
        return this.power;
    }
}
