import java.util.Arrays;
import java.util.Scanner;

public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="Abhishek";
        String str1="Abhishek";
        String str2=new String("Abhishek Kaplesh                 ");
        String str3="geekss@for@geekss";
        System.out.println(str==str1);
        System.out.println(str==str2);
        System.out.println(str1==str2);
        System.out.println(str.equals(str2));
        System.out.println(str);
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str2.trim());
        System.out.println(str.charAt(5));
        System.out.println(str.concat(" HARE KRISHNA"));
        System.out.println(str.endsWith("z"));
        System.out.println(str.indexOf("h"));
        System.out.println(str.length());
        String [] a= str3.split("@");
        System.out.println(Arrays.toString(a));
        System.out.println(str.lastIndexOf("h"));
        System.out.println(str.compareTo(str3));
        System.out.println(str.contains(str2));
        System.out.println(str.substring(1));
        System.out.println(str.substring(0,7));

        System.out.println("Abhishek " + "Kaplesh");
        System.out.println(Arrays.toString( new int[]{1,2,3,4,5}) + " This is my array " );
        System.out.println(Arrays.toString(new int[]{21,23,34}) + 'A');
        System.out.println('a' + 'Z');
        System.out.println('a' + "B");


    }
}
