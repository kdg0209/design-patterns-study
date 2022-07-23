package singletonPattern;

import java.io.Serializable;

// double checked locking
// 직렬화 역직렬화를 이용하여 싱글톤 패턴을 깨트리기 위해 implements Serializable
public class SettingsV4 implements Serializable {

    private static volatile SettingsV4 instance;

    private SettingsV4() {}

    public static SettingsV4 getInstance() {
        if (instance == null) { // check 1
            synchronized (SettingsV4.class) {
                if (instance == null) { // check 2
                    instance = new SettingsV4();
                }
            }
        }
        return instance;
    }

    // 역직렬화에 대응하기 위해 readResolve 메서드를 사용하여
    // 새로운 인스턴스가 아닌 getInstance 메서드를 사용하여 인스턴스 반환
    protected Object readResolve() {
        return getInstance();
    }
}
