import java.util.Scanner;

public class StringBuilderBasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder("abc");
        System.out.println(str);
        str.setCharAt(0,'A');
        System.out.println(str);
        str.append("ABC");
        System.out.println(str);
        System.out.println(str.length());
        str.insert(3,"ABADABA00");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.reverse());
        str.delete(2,4);
        System.out.println(str);
        System.out.println(str.length());
        str.deleteCharAt(1);
        System.out.println(str);
        System.out.println(str.length());
        str.replace(1,4,"HABAE");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.repeat("ABC", 2));
        System.out.println(str.length());
        System.out.println(str);
        System.out.println(str.isEmpty());
        str.trimToSize();
        System.out.println(str);
        System.out.println(str.length());
        str.setLength(10);
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.substring(1,6));
    }
}
