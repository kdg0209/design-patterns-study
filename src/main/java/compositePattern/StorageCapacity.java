package compositePattern;

public class StorageCapacity implements SmartPhoneDevice{
    private int price;
    private int power;

    public StorageCapacity(int price, int power) {
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
