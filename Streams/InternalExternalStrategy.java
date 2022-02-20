package Streams;
import java.util.*;
class Movie{
    String name;
    boolean classic;
    Movie(String name,boolean classic){
        this.name=name;
        this.classic=classic;
    }
    public boolean isClassic(){
        return this.classic;
    }
    public String getName(){
        return this.name;
    }
}
class MovieUtil{
    public static List<Movie> m=new ArrayList<Movie>();
    public static List<Movie> createMovies(){
        m.add(new Movie("Hello kiddo",true));
        m.add(new Movie("Welcome Home",true));
        m.add(new Movie("Home Alone",false));
        m.add(new Movie("DoLittle",false));
        return m;
    }
    public void addMovie(Movie movie){
        this.m.add(movie);
    }
}
public class InternalExternalStrategy {
    List<Movie> movies=MovieUtil.createMovies();
    List<Movie> top2Classics=new ArrayList<Movie>(10);
    private void testExternalIter1(){
        for(Movie m:movies){
            if(m.isClassic()){
                top2Classics.add(m);//needs a lot of memory if size is large
            }
        }
        System.out.println("top2Classic : "+top2Classics);
    }
    public void testInternalIter1() {
        movies.parallelStream().filter(Movie::isClassic).map(Movie::getName).forEach(System.out::println);
    }
    public static void main(String[] args){
         MovieUtil mu=new MovieUtil();
         mu.addMovie(new Movie("Hello kiddo",true));
         mu.addMovie(new Movie("Welcome Home",true));
         mu.addMovie(new Movie("Home Alone",false));
         mu.addMovie(new Movie("DoLittle",false));
         InternalExternalStrategy ies=new InternalExternalStrategy();
         ies.testInternalIter1();
         ies.testExternalIter1();
    }
}
