package methods;

public class CountDown {
    public static void countUpTo(int s,int e){
        if(s==e){
            System.out.println(e);
            return;
        }
        System.out.print(s+" ");
         countUpTo(s+1,e);
    }
    public static void main(String[] args){
        countUpTo(1,15);
    }
}
