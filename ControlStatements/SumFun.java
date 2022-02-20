package ControlStatements;
import java.util.*;
public class SumFun {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter numbers :");
        num=scanner.nextInt();
        while(num>=0){
            sum+=num;
            num=scanner.nextInt();
        }
        System.out.println("Sum of the given numbers : \t"+sum);
    }
}
