package arraysArrayLists;
import java.util.*;
public class ProjArrays {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter five elements :");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]*2);
        }
    }
}
