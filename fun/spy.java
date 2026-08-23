import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner (System.in);
        int n=z.nextInt();
        int sum=0;
        int pro=1;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            pro=pro*digit;
            n=n/10;  
        }
        if(sum==pro){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}