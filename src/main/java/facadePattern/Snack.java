package facadePattern;

public class Snack {
    private String name;

    public Snack(String name) {
        this.name = name;
    }

    public void setSnack() {
        System.out.println(name + "과자를 준비합니다.");
    }
}
