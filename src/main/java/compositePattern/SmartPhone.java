package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class SmartPhone implements SmartPhoneDevice{
    private List<SmartPhoneDevice> components = new ArrayList<>();

    public void addComponent(SmartPhoneDevice component) {
        components.add(component);
    }

    public void removeComponent(SmartPhoneDevice component) {
        components.remove(component);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(SmartPhoneDevice::getPrice).sum();
    }

    @Override
    public int getPower() {
        return components.stream().mapToInt(SmartPhoneDevice::getPower).sum();
    }
}
