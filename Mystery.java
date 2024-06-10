import java.util.Arrays;

public class Mystery extends Movie implements Mysteryable{

    public Mystery(String title, String[] starring, int runningTime, String country, String language) {
        super(title, starring, runningTime, country, language);
    }

    @Override
    public String getType() {
        return "Mystery";
    }

    @Override
    public String toString() {
        return "\nMystery\n the title: "+getTitle()+" ,starring: "+ Arrays.toString(getStarring())+" ,runningTime: "+getRunningTime()+" ,country: "+getCountry()+" ,language: "+getLanguage();
    }

    @Override
    public boolean equals(Movie movie) {
        return getRunningTime() == movie.getRunningTime();
    }
}
