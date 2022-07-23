package singletonPattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example  {
    public static void main(String[] args) throws Exception{
        newInstanceWithSerializable();
    }

    // 직렬화 역직렬화를 이용하여 싱글톤패턴 깨트리는 방법
    public static void newInstanceWithSerializable() throws IOException, ClassNotFoundException {
        SettingsV4 settings1 = SettingsV4.getInstance();
        SettingsV4 settings2 = null;

        // 직렬화
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings1);
        }

        // 역직렬화
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (SettingsV4) in.readObject();
        }

        System.out.println(settings1 == settings2);
    }

    // 리플렉션을 이용하여 싱글톤을 깨트리는 방법
    public static void newInstanceWithReflect() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SettingsV5 settings1 = SettingsV5.getInstance();
        SettingsV5 settings2 = SettingsV5.getInstance();

        Constructor<SettingsV5> constructor = SettingsV5.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingsV5 settings3 = constructor.newInstance();

        System.out.println(settings1 == settings2);
        System.out.println(settings1 == settings3);
    }
}
