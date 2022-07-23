package singletonPattern;

// 이른 초기화 방식
public class SettingsV3 {

    private static final SettingsV3 INSTANCE = new SettingsV3();

    private SettingsV3() {}

    public static SettingsV3 getInstance() {
        return INSTANCE;
    }
}
