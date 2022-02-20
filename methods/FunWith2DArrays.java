package methods;
import java.util.*;
public class FunWith2DArrays {
    public static void twice2DArray(){
        int[][] arr=new int[2][3];
        Random random=new Random();
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=2*random.nextInt(10);
            }
        }
        print2DArray(arr);
    }
    public static void print2DArray(int[][] arr){
        for(int[] a:arr){
            for(int num:a){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        twice2DArray();
    }
}
