package singletonPattern;


// synchronized 키워드를 사용한 방식
public class SettingsV2 {
    private static SettingsV2 instance;
    private SettingsV2() {}

    public static synchronized SettingsV2 getInstance() {
        if (instance == null) {
            return new SettingsV2();
        }
        return instance;
    }
}
