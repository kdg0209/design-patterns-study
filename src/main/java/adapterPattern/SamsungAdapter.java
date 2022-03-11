package adapterPattern;

public class SamsungAdapter implements AppleProduct{

    private SamsungProduct samsungProduct;

    public SamsungAdapter(SamsungProduct samsungProduct) {
        this.samsungProduct = samsungProduct;
    }

    @Override
    public void charging(String name) {
        samsungProduct.charging(name);
    }

    @Override
    public void playNumbers(String name) {
        samsungProduct.playExecl(name);
    }

    @Override
    public void playKeynote(String name) {
        samsungProduct.playPowerpoint(name);
    }
}
