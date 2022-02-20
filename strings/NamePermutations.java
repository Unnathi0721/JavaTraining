package strings;
import java.util.*;
public class NamePermutations {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> first=new ArrayList<String>();
        ArrayList<String> last=new ArrayList<String>();
        for(int i=0;i<5;i++){
            first.add(scanner.next());
            last.add(scanner.next());
        }
        for(String f:first){
            for(String l:last){
                System.out.println(f+" "+l);
            }
        }

    }
}
