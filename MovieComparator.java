import java.util.Comparator;

public class MovieComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        //First compare by movie type
        int typeComparison = m1.getType().compareTo(m2.getType());
        if (typeComparison != 0) {
            return typeComparison;
        }
        //If movie types are the same, compare by running time
        return Integer.compare(m1.getRunningTime(), m2.getRunningTime());
    }
}