import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=z.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
 sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}