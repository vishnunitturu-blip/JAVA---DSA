import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        
        while(n>0){
            int digit=n%10;
            System.out.print(digit);
            n=n/10;
        } 
       
    }
}
