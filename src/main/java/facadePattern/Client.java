package facadePattern;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade("오감자", "스파이더맨");
        facade.viewMovie();
    }
}
