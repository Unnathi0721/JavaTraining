package arraysArrayLists;
import java.util.*;
public class ProjArrayLists {
    public static void main(String[] args){
        ArrayList<Double> al=new ArrayList<Double>();
        Scanner scanner=new Scanner(System.in);
        double val=scanner.nextDouble();
        while(val>=0){
            al.add(val);
            val=scanner.nextDouble();
        }
        for(int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i));
        }
    }
}
