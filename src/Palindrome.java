import java.util.Scanner;

public class Palindrome {
    public static int palindrome(String str,int s,int e){
        char arr[]=str.toCharArray();
        if(arr[s]!=arr[e]){
            return 0;
        }
        if(s>e){
            return 1;
        }
        return palindrome(str,s+1,e-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word :");
        String word=sc.nextLine();
        int val=palindrome(word,0,word.length()-1);
        System.out.println(val);
    }
}