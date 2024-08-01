package Learnmaxxing.Assignment_Classes_and_Objects_and_Constructors;

import java.time.LocalDate;
import java.util.ArrayList;

public class MovieDTO{
    public static int movieid = 0;
    private static String moviename;
    private static LocalDate releasedate;
    private static ArrayList<String> cast;
    private static int rating;
    public static ArrayList<MovieDTO> array = new ArrayList<>();
    public MovieDTO(String moviename, LocalDate releasedate, ArrayList<String> cast,int rating){
        array.add(movieid,this);
        this.moviename = moviename;
        this.releasedate = releasedate;
        this.cast = cast;
        this.rating = rating;
        this.movieid++;
    }

    public static int getMoviecount() {
        return movieid;
    }

    public static void setMovieid(int movieid) {
        MovieDTO.movieid = movieid;
    }

    public static String getMoviename() {
        return moviename;
    }

    public static void setMoviename(String moviename) {
        MovieDTO.moviename = moviename;
    }

    public static LocalDate getReleasedate() {
        return releasedate;
    }

    public static void setReleasedate(LocalDate releasedate) {
        MovieDTO.releasedate = releasedate;
    }

    public static ArrayList<String> getCast() {
        return cast;
    }

    public static void setCast(ArrayList<String> cast) {
        MovieDTO.cast = cast;
    }

    public static int getRating() {
        return rating;
    }

    public static void setRating(int rating) {
        MovieDTO.rating = rating;
    }
}