package abstractFactoryPattern.after;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ship {

    private String name;
    private String color;
    private Anchor anchor;
    private Wheel wheel;

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}

