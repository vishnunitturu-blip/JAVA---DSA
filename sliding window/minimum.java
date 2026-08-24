import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int target=z.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=z.nextInt();
        }
        int l=0,r=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        while(r<n){
            sum+=arr[r];
            while(sum>=target){
                min=Math.min(min,r-l+1);
                sum-=arr[l];
                l++;
            }
            r++;
        }
        if(min==Integer.MAX_VALUE) System.out.print(0);
        else System.out.print(min);
    }
}
