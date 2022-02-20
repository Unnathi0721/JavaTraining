package LambdaExercise;

public class CreatingLambdas {
    interface Greeting{
        public String sayHello(String msg);
    }
    public void testGreeting(String a,Greeting g){
        String result=g.sayHello(a);
        System.out.println("Result : "+result);
    }
    public static void main(String[] args){

        new CreatingLambdas().testGreeting("Nemo",(String s)->"Hello, "+s);
    }
}
