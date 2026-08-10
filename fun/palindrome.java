import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int st=n;
        int sum=0;
        while(n>0){
              int digit=n%10;
              sum=sum*10+digit;
            n=n/10;
        }
        if(st==sum){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
        
    }
}
