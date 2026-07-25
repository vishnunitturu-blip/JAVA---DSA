import java.io.*;
import java.util.*;

public class Solution {
    static void num(int n){
        if(n==0){
            return;
        }
        num(n-1);
         System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        num(n);
        
    }
}