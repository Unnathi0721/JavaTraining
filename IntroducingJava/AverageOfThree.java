package IntroducingJava;
import java.util.*;
public class AverageOfThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double num3=sc.nextDouble();
        double ans;
        ans=(num1+num2+num3)/3;
        System.out.println(ans);
    }
}
