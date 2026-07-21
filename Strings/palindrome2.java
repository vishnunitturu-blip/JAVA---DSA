import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        String s=z.nextLine();
        int n=s.length();
        int p1=0,p2=n-1;
        while(p1<p2){
            if(s.charAt(p1)!=s.charAt(p2)){
                System.out.println("Not a Palindrome");
                return;
            }
            p1++;
            p2--;
        }
        System.out.println("Palindrome");
    }
}