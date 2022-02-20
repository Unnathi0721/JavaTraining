package strings;

public class StringMethods2 {
    public static void main(String[] args){
        String myName="Unnathi";
        String upper=myName.toUpperCase();
        String lower=myName.toLowerCase();
        int whereisN=myName.indexOf(1);
        String half=myName.substring(3);
        System.out.println("upper is : "+upper);
        System.out.println("lower is : "+lower);
        System.out.println("N is at index : "+whereisN);
        System.out.println("Half is : "+half);
    }
}
