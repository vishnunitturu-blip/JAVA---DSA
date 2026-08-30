import java.io.*;
import java.util.*;

public class Solution {
    static boolean vowel(char c){
        return(c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        String s=z.nextLine().toLowerCase();
        int n=s.length();
        int k=z.nextInt();
        int count=0;
        for(int i=0;i<k;i++){
            if(vowel(s.charAt(i))){
                count++;
            }
        }
            int max=count;
            for(int i=k;i<n;i++){
                    if(vowel(s.charAt(i))){
                        count++;
                    }
                if(vowel(s.charAt(i-k))){
                    count--;
                }
                max=Math.max(max,count);
            }
            System.out.print(max);
        }
    }
