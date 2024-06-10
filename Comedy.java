import java.util.Arrays;

public class Comedy extends Movie implements Comedyable{

    public Comedy(String title, String[] starring, int runningTime, String country, String language) {
        super(title, starring, runningTime, country, language);
    }

    @Override
    public String getType() {
        return "Comedy";
    }

    @Override
    public String toString() {
        return "\nComedy\n the title: "+getTitle()+" ,starring: "+ Arrays.toString(getStarring())+" ,runningTime: "+getRunningTime()+" ,country: "+getCountry()+" ,language: "+getLanguage();
    }

    @Override
    public boolean equals(Movie movie) {
        return getRunningTime() == movie.getRunningTime();
    }
}
