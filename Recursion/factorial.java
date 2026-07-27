import java.io.*;
import java.util.*;

public class Solution {
    static int fac(int n){
        if(n==0){
            return 1;
        }
        return n*fac(n-1);
    }

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        System.out.println("Factorial of a number is "+fac(n));
    }
}