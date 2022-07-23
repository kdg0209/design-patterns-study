package singletonPattern;

public class SettingsV1 {

    private static SettingsV1 instance;

    private SettingsV1() {}

    public static SettingsV1 getInstance() {
        if (instance == null) {
            return new SettingsV1();
        }
        return instance;
    }
}
