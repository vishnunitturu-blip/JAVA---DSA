import java.io.*;
import java.util.*;

public class Solution {
    static int fun(int n,int rev){
        if(n==0) return rev;
        int l=n%10;
        rev=(rev*10)+l;
        return fun(n/10,rev);
    }

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        System.out.println(fun(n,0));
    }
}
