package ControlStatements;
import java.util.*;
public class EvenOnly {
    public static void main(String[] args){
        //Scanner scanner=new Scanner(System.in);
        int num=0;
        System.out.println("Printing even numbers from 0 to 10 :");
        while(num<=10){
            if(num%2!=0) {
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
