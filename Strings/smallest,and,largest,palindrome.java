import java.io.*;
import java.util.*;

public class Solution {
    static boolean ispal(String s){
        int n=s.length();
        int p1=0,p2=n-1;
        while(p1<p2){
            if(s.charAt(p1)!=s.charAt(p2)){
                return false;
            }
            p1++;
            p2--;
        }
                return true;
        }
    

    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        String s=z.nextLine();
        String[]arr=s.split(" ");
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        String largest="";
        String smallest="";
        for(int i=0;i<n;i++){
            String word=arr[i];
            if(word.length()==1) continue;
            boolean pal=ispal(word);
            if(pal){
                if(word.length()>max){
                    max=word.length();
                    largest=word;
                }
                if(word.length()<min){
                    min=word.length();
                    smallest=word;
                }
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}