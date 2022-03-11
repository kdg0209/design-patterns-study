package singletonPattern;

public class User {

    private User(){}

    public static User getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final User instance = new User();
    }
}
