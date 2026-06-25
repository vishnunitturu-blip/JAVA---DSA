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
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
if( arr[i]>max) max=arr[i];
    if( arr[i]<min) min=arr[i];
        }
        System.out.println(max+" "+min);
    }
}