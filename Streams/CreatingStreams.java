package Streams;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.*;

public class CreatingStreams {
    private void testCollectionStreams(){
        //List<Movie> movies=MovieUtil.createMovies();
        //movies.stream().forEach(System.out::println);
    }
    private void testEmptyStreams(){
       // Stream<Movie> moviesEmptyStream= Stream.empty();
       // System.out.println("Empty Stream :"+moviesEmptyStream.count());
    }
    private void testStreamsFromValues(){
        Stream<String> movieNames=Stream.of("God's must be crazy","Fiddler on the roof");
        System.out.println(movieNames.count());
        String[] movies={"God's must be crazy","Fiddler on the roof"};
        Stream<String> movie=Stream.of(movies);

    }
    public void testFileStream(){
        try{
            Stream<String> fileLines=Files.lines(Paths.get("/Users/...."));
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void testGenerateIterateStream(){
        //Stream<Double> randomStream=Stream.generate(Math::random);
       // randomStream.forEach(System.out::println);
        Stream<Integer> wholeNumbers=Stream.iterate(1,i->i+1);
        wholeNumbers.forEach(System.out::println);
    }
    public static void main(String[] args){
          new CreatingStreams().testGenerateIterateStream();
    }
}
