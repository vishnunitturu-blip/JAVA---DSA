import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int k=z.nextInt();
        int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=z.nextInt();
            }
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
         System.out.print(sum+" ");
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
                    System.out.print(sum+" ");

            
        }
    }
}
