import java.io.*;
import java.util.*;

public class Solution {
    static int fun(int n,int i,int [] arr,int max){
        if(i==n)
            return max;
        if(arr[i]>max)max=arr[i];
        return fun(n,i+1,arr,max);
    }

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
                arr[i]=z.nextInt();
        }
        int ans=fun(n,0,arr,Integer.MIN_VALUE);
        System.out.print(ans);
        
    }
}
