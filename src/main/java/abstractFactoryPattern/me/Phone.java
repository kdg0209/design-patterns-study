package abstractFactoryPattern.me;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class Phone {

    private Company company;
    private Battery battery;
    private Camera camera;
}
