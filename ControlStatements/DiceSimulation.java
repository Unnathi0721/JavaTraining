package ControlStatements;
import java.util.*;
public class DiceSimulation {
    public static void main(String[] args){
        //Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Output of Dice roll");
        for(int i=0;i<10;i++){
            System.out.println("turn "+(i+1)+" :\t"+(random.nextInt(6)+1));
        }
    }
}
