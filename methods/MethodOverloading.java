package methods;

public class MethodOverloading {
    public static int getResult(int n){
        return n*n;
    }
    public static String getResult(String s1,String s2){
        return s1+" "+s2;
    }
    public static void main(String[] args){
        System.out.println(getResult(10));
        System.out.println(getResult("hi","World"));
    }
}
