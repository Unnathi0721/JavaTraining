package arraysArrayLists;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args){
        ArrayList<String> nameList;
        nameList=new ArrayList();
        nameList.add("John");
        nameList.add("Kyle");
        nameList.add("Matthew");
        nameList.add("Amanda");
        nameList.add("Wendy");
//        for(int i=0;i<nameList.size();i++){
//            System.out.println(nameList.get(i));
//        }
        for(String name:nameList){
            System.out.println(name);
        }
    }
}
