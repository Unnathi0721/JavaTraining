package Streams;
import java.util.*;
import java.util.stream.Stream;

public class LazyEagerStreams {
    List<Movie> movies=MovieUtil.createMovies();
    private void testLazy(){
        movies.stream().filter(m->{System.out.println("Inside Lazy Operation");
        return m.isClassic();
        }).count();
    }
    private void testEager(){
        Stream<Movie> moviesStream=movies.stream()
                .filter(m->{
                    System.out.println("Filtering");
                    return m.isClassic();
                }).map(s->{
                    System.out.println("Mapping");
                            return s;
                });
    }
    public static void main(String[] args){

    }
}
