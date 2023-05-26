package fc.introduction.movie;

public class Movie {

    private final String title;
    private final String directorNameAndSurname;
    private final int movieDuration;
    private final int productionYear;

    public Movie(String title, String directorNameAndSurname, int movieDuration, int productionYear) {
        this.title = title;
        this.directorNameAndSurname = directorNameAndSurname;
        this.movieDuration = movieDuration;
        this.productionYear = productionYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirectorNameAndSurname() {
        return directorNameAndSurname;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String toString() {
        return "MovieFeatures{" +
                "title='" + title + '\'' +
                ", nameAndSurnameDirector='" + directorNameAndSurname + '\'' +
                ", duration=" + movieDuration +
                ", productionYear=" + productionYear +
                '}';
    }
}
