package LambdaExercise;
import java.util.concurrent.Callable;
public class Runnables {
    public void methodAcceptingRunnable(Runnable runnable){

    }
    public void methodAcceptingCallable(Callable callable){

    }

    public static void email(){

    }
    public static void persist(){

    }

    interface Tradable<Trade>{
         boolean check(Trade t);
    };

    public static void main(String[] args){
       // Tradable<Trade> bigTradeLambda1 = (trade)->trade.isBigTrade();
        //Tradable<Trade> bigTradeLambda2 = (trade)->trade.getInstrument().equals("IBM");
    }
}
