package ControlStatements;
import java.util.*;
public class DivisibleByThree {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scanner.nextInt();
        if(num%3==0){
            System.out.println(num+" is divisible by 3");
        }
        else{
            System.out.println(num+" is Not divisible by 3");
        }
    }
}
