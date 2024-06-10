
abstract class Movie implements Cloneable, Comparable<Movie> {
    private String title;
    private String[] Starring;
    private int runningTime;
    private String  country;
    private String  language;

    protected Movie(String title, String[] starring, int runningTime, String country, String language) {
        setTitle(title);
        setStarring(starring);
        setRunningTime(runningTime);
        setCountry(country);
        setLanguage(language);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getStarring() {
        return Starring;
    }

    public void setStarring(String[] starring) {

        Starring = starring;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    //abstract method to Force all the sub-classes to override toString and equals methods and getType .
    public abstract String getType();
    public abstract String toString();
    public abstract boolean equals(Movie movie);

    @Override
    public Movie clone() {
        try {
            return (Movie) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can't happen
        }
    }

    @Override
    public int compareTo(Movie m) {
        return this.title.compareTo(m.getTitle());
    }
}
