//lina abufarha
//1211968

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.PrintWriter;


public class Driver {

    static ArrayList<Movie> movies = new ArrayList<>();

    public static void main(String[] args)  {

        try{
            File f=new File("C:\\Users\\Lenovo\\Desktop\\lina J\\New\\Assignment3\\src\\movies.txt");

            Scanner input=new Scanner(f);
            while(input.hasNext()) {
                String line = input.nextLine();
                try {
                    addMovie(line);

                } catch (Exception e) {
                    System.out.println("Error! "+e.getMessage());
                }
             }

        }catch (FileNotFoundException e1){
            System.out.println("Error File Not Found!");
        }

        System.out.println("Numper of Movies: "+movies.size());

        System.out.println(movies.toString());
        // Sort movies using MovieComparator
        Collections.sort(movies, new MovieComparator());

        System.out.println(" ---------------- ");

        System.out.println(movies.toString());

        writeMoviesToFile(movies);

    }

    public static void addMovie(String line) throws Exception{

        String[] tokens=line.split(":");

        if(tokens.length!=2) throw new MovieException("Required information is missing 1 !");

        String type = tokens[0]; //To set the type of movie

        tokens=tokens[1].split("[\\[\\]]");
        if(tokens.length!=3) throw new MovieException("Required information is missing 2 !");
        tokens[1]=tokens[1].replaceAll("[\\[\\]]", "");
        tokens[1]=tokens[1].replaceAll(",", "-"); //To take it in one token

        String[] starring = tokens[1].split("-"); //To set an array of movies starring

        line=tokens[0]+tokens[1]+tokens[2];
        tokens=line.split(",");

        if(tokens.length!=5) throw new MovieException("Required information is missing 3 !");
        String title = tokens[0];
        int runningTime = Integer.parseInt(tokens[2].trim()); ////////////
        String country = tokens[3];
        String language = tokens[4];

        //Create an object and add it to the Arraylist
        switch (type) {
            case "Action":
                movies.add(new Action(title, starring, runningTime, country, language));
                break;
            case "Comedy":
                movies.add(new Comedy(title, starring, runningTime, country, language));
                break;
            case "Romance":
                movies.add(new Romance(title, starring, runningTime, country, language));
                break;
            case "Mystery":
                movies.add(new Mystery(title, starring, runningTime, country, language));
                break;
            case "Hollywood Blockbuster":
                movies.add(new HollywoodBlockbuster(title, starring, runningTime, country, language));
                break;
            case "Rescue":
                movies.add(new Rescue(title, starring, runningTime, country, language));
                break;
            case "RomanticComedy":
                movies.add(new RomanticComedy(title, starring, runningTime, country, language));
                break;
            default:
                throw new MovieException("Unknown movie type");
        }

    }

    public static void writeMoviesToFile(ArrayList<Movie> movies){
        PrintWriter pw;
        try{
            pw = new PrintWriter("sorted_movies.txt");
            for (Movie movie : movies) {
                pw.println(movie.toString());
            }
            pw.flush();
            pw.close();
        }catch (FileNotFoundException e){
            System.out.println("Error, Unable to write to file sorted_movies.txt!" );
        }

    }

}
