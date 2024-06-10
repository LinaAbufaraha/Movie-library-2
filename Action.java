import java.util.Arrays;

public class Action extends Movie implements Actionable{

    public Action(String title, String[] starring, int runningTime, String country, String language) {
        super(title, starring, runningTime, country, language);
    }

    @Override
    public String getType() {
        return "Action";
    }

    @Override
    public String toString() {
        return "\nAction\n the title: "+getTitle()+" ,starring: "+ Arrays.toString(getStarring())+" ,runningTime: "+getRunningTime()+" ,country: "+getCountry()+" ,language: "+getLanguage();

    }

    @Override
    public boolean equals(Movie movie) {
        return getRunningTime() == movie.getRunningTime();
    }


}
