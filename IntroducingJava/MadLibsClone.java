package IntroducingJava;
import java.util.*;
public class MadLibsClone {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String adjective1;
        String girl_name;
        String adjective2;
        String occupation1;
        String place;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boy_name;
        String mans_name;
        System.out.println("Enter adjective1");
        adjective1=scanner.nextLine();
        System.out.println("Enter girl's name");
        girl_name=scanner.nextLine();
        System.out.println("Enter adjective2");
        adjective2=scanner.nextLine();
        System.out.println("Enter occupation1");
        occupation1=scanner.nextLine();
        System.out.println("Enter place");
        place=scanner.nextLine();
        System.out.println("Enter clothing");
        clothing=scanner.nextLine();
        System.out.println("Enter hobby");
        hobby=scanner.nextLine();
        System.out.println("Enter adjective3");
        adjective3=scanner.nextLine();
        System.out.println("Enter occupation2");
        occupation2=scanner.nextLine();
        System.out.println("Enter boy's name");
        boy_name=scanner.nextLine();
        System.out.println("Enter man's name");
        mans_name=scanner.nextLine();
        System.out.println("There once was a "+adjective1 +"girl named "+ girl_name+", who was a "+adjective2 +occupation1+" in the Kingdom of "+place+".");
        System.out.println("she loved to wear "+clothing +"and to "+hobby+".\n She wanted to marry the "+adjective3+ occupation2 +"named "+boy_name +"but her father, king "+mans_name +"forbid her from seeing him.");
    }
}
