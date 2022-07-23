package singletonPattern;

// static inner class 사용
public class SettingsV5 {

    private SettingsV5() {}

    private static class SettingsHolder {
        private static final SettingsV5 INSTANCE = new SettingsV5();
    }

    public static SettingsV5 getInstance() {
        return SettingsHolder.INSTANCE;
    }

}
