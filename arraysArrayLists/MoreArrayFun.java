package arraysArrayLists;

public class MoreArrayFun {
    public static void main(String[] args){
        int[] array=new int[10];
        for(int i=0;i<10;i++){
            array[i]=i+1;
        }
        System.out.println("Elements of the array : ");
        for(int num:array){
            System.out.println(num);
        }
    }
}
