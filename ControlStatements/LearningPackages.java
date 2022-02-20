package ControlStatements;
import java.util.*;
public class LearningPackages {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Select which learning package you want to choose - 1 or 2 or 3   :");
        int packageNo=scanner.nextInt();
        System.out.print("How many Courses did you register for this month : ");
        int no_of_courses=scanner.nextInt();
        int cost;
        int baseCost=0,coursesPerPack=0,additionalCost=0;
        if(packageNo==1){
            baseCost=10;
            coursesPerPack=2;
            additionalCost=6;
        }
        else if(packageNo==2){
            baseCost=12;
            coursesPerPack=4;
            additionalCost=4;
        }
        else{
            baseCost=15;
            coursesPerPack=6;
            additionalCost=3;
        }
        cost=baseCost;
        cost+=(no_of_courses>coursesPerPack)?(no_of_courses-coursesPerPack)*additionalCost:0;
        System.out.println("Total cost is : "+cost);
    }
}
