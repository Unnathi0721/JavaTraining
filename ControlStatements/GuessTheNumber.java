package ControlStatements;
import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int num=random.nextInt(100)+1;
        int guessNum;
        System.out.print("Enter your guess Integer : ");
        int ct=1;
        do{
            guessNum=scanner.nextInt();
            if(guessNum<1 || guessNum>100){
                System.out.println("Guess Invalid");
            }
            else if(guessNum==num){
                System.out.println("Congratulations! You guessed the number in "+ct+" guesses. Thanks for playing!");
                break;
            }
            else if(guessNum>num){
                System.out.println("Your guess was too high!");
            }
            else{
                System.out.println("Your guess was too low!");
            }
            ct+=1;
            System.out.print("Enter your guess Integer : ");
        }
        while(guessNum!=num);
    }
}
