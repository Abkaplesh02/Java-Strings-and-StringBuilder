import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check for palindrome :: ");
        String a=sc.next();

        int start=0;
        int end=a.length()-1;
        while(start<end){
            if(a.charAt(start)==a.charAt(end)){
                start++;
                end--;
            }
            else{
            System.out.println("This is not palindrome");
            return;
            }
        }
        System.out.println("This is palindrome");
    }
}
