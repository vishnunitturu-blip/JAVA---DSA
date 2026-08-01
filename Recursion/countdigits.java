import java.io.*;
import java.util.*;

public class Solution {
    static int num(int n,int count){
        if(n==0)return count; 
        count+=1;
        return num(n/10,count);
        
    }

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int ans=num(n,0);
        System.out.print(ans);
        
    }
}
