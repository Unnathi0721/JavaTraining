package arraysArrayLists;
import java.util.*;
public class ProjParallel {
    public static void main(String[] aargs){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> ageList=new ArrayList<>();
        ArrayList<String> nameList=new ArrayList<>();
        String name;
        int age;
        for(int i=0;i<5;i++){
            System.out.print("Enter a name : ");
            name=scanner.next();
            nameList.add(name);
            System.out.print("Enter an age : ");
            age=scanner.nextInt();
            ageList.add(age);
        }
        for(int i=0;i<5;i++){
            System.out.println(nameList.get(i)+" is "+ageList.get(i)+" years old");
        }
    }
}
