package ControlStatements;
import java.util.*;
public class Fraternity {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your gender");
        char gender=scanner.next().charAt(0);
        if(age>=19 && gender=='M'){
            System.out.println("you are eligible");
        }
        else{
            System.out.println("you are not eligible");
        }
    }
}
