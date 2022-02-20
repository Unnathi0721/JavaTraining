package methods;
import java.util.*;
public class SumOfElements {
    public static int sumElements(List<Integer> list){
        int sum=0;
        for(Integer num:list){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args){
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(sumElements(list));
    }
}
