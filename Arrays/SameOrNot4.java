import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n1=z.nextInt();
        int []arr1=new int[n1];
        for(int i=0;i<n1;i++){
 arr1[i]=z.nextInt();
        }
        int n2=z.nextInt();
        int []arr2=new int[n2];
        for(int i=0;i<n2;i++){
 arr2[i]=z.nextInt();
        }
        int sum1=0;
        for(int i=0;i<n1;i++){
            sum1=sum1+arr1[i];
        }
        int sum2=0;
        for(int i=0;i<n2;i++){
sum2=sum2+arr2[i];
        }
        if(sum1==sum2 && n1==n2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
    
}