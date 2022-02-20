package Streams;
import java.util.*;
import java.util.stream.*;

public class PrimitiveSteams {
    private void doubleStream(){
        double[] doubles=new double[]{2,3,4,5,10};
        DoubleStream doubleStream=DoubleStream.of(doubles);
        doubleStream.forEach(System.out::println);
        DoubleStream doubleStream2=DoubleStream.of(2,3,4,5,10);
        doubleStream2.forEach(System.out::println);
    }
    private void intStream(){
        int[] ints=new int[]{2,3,4,5,10};
        IntStream intStream=IntStream.of(ints);
        intStream.forEach(System.out::println);
        IntStream intStream2=IntStream.of(2,3,4,5,10);
        intStream2.forEach(System.out::println);
    }
    private void convertStreams(){
        int[] ints=new int[]{2,3,4,5,10};
        IntStream intStream=IntStream.of(ints);
        intStream.forEach(System.out::println);
        IntStream intStream2=IntStream.of(2,3,4,5,10);
        intStream2.forEach(System.out::println);
    }
    public void main(String[] args){
        PrimitiveSteams primitiveStreams=new PrimitiveSteams();
        primitiveStreams.intStream();
        primitiveStreams.doubleStream();
        primitiveStreams.convertStreams();
    }
}
