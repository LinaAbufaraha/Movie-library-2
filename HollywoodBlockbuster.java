import java.util.Arrays;

public class HollywoodBlockbuster extends Movie implements Actionable,Romanceable,Comedyable,Mysteryable{

    public HollywoodBlockbuster(String title, String[] starring, int runningTime, String country, String language) {
        super(title, starring, runningTime, country, language);
    }

    @Override
    public String getType() {
        return "Hollywood Blockbuster";
    }

    @Override
    public String toString() {
        return "\nHollywoodBlockbuster\n the title: "+getTitle()+" ,starring: "+ Arrays.toString(getStarring())+" ,runningTime: "+getRunningTime()+" ,country: "+getCountry()+" ,language: "+getLanguage();
    }

    @Override
    public boolean equals(Movie movie) {
        return getRunningTime() == movie.getRunningTime();
    }
}
