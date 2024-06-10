import java.util.Arrays;

public class RomanticComedy extends Movie implements Romanceable, Comedyable{

    public RomanticComedy(String title, String[] starring, int runningTime, String country, String language) {
        super(title, starring, runningTime, country, language);
    }

    @Override
    public String getType() {
        return "RomanticComedy";
    }

    @Override
    public String toString() {
        return "\nRomanticComedy:\n  the title: "+getTitle()+" ,starring: "+ Arrays.toString(getStarring())+" ,runningTime: "+getRunningTime()+" ,country: "+getCountry()+" ,language: "+getLanguage();
    }

    @Override
    public boolean equals(Movie movie) {
        return getRunningTime() == movie.getRunningTime();
    }
}
