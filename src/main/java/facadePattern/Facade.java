package facadePattern;

public class Facade {
    private String snackName;
    private String movieName;

    public Facade(String snackName, String movieName) {
        this.snackName = snackName;
        this.movieName = movieName;
    }

    public void viewMovie() {
        Snack snack = new Snack(snackName);
        Tv tv = new Tv();
        Movie movie = new Movie(movieName);

        snack.setSnack();
        tv.turnOn();
        movie.searchMovie();
        movie.choiceMovie();
        movie.buyMovie();
        movie.playMovie();
    }
}
