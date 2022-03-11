package prototypePattern;

import java.util.HashMap;
import java.util.Map;

public class SmartPhoneStore {

    private Map<Person, SmartPhone> store = new HashMap<>();

    public void save(Person person) {
        SmartPhone smartPhone = null;

        if (person == Person.APPLE) {
            smartPhone = new AppleSmartPhone();
        }

        if (person == Person.SAMSUNG) {
            smartPhone = new SamsungSmartPhone();
        }
        store.put(person, smartPhone);
    }

    public SmartPhone buy(Person person){
        SmartPhone smartPhone = store.get(person);

        return smartPhone.createClone();
    }
}
