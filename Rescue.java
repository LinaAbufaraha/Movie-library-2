import java.util.Arrays;

public class Rescue extends Movie implements Actionable , Romanceable{

    public Rescue(String title, String[] starring, int runningTime, String country, String language) {
        super(title, starring, runningTime, country, language);
    }

    @Override
    public String getType() {
        return "Rescue";
    }

    @Override
    public String toString() {
        return "\nRescue\n  the title: "+getTitle()+" ,starring: "+ Arrays.toString(getStarring())+" ,runningTime: "+getRunningTime()+" ,country: "+getCountry()+" ,language: "+getLanguage();

    }
    @Override
    public boolean equals(Movie movie) {
        return getRunningTime() == movie.getRunningTime();
    }
}
