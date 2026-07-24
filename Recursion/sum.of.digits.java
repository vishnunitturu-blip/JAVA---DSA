import java.io.*;
import java.util.*;

public class Solution {
    static int sumdigits(int n){
        if(n==0){
    return 0;
    }
    return (n%10)+sumdigits(n/10);
        }
    public static void main(String[] args) {
        Scanner z= new Scanner (System.in);
        int n=z.nextInt();
        System.out.print(sumdigits(n));
        
    }
}