package facadePattern;

public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public void searchMovie() {
        System.out.println(name + " 영화를 검색합니다.");
    }

    public void choiceMovie() {
        System.out.println("영화를 선택합니다.");
    }

    public void buyMovie() {
        System.out.println("영화를 결제합니다.");
    }

    public void playMovie() {
        System.out.println("영화를 시청합니다.");
    }
}
