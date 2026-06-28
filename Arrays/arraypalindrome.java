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
        int p1=0,p2=n-1;
        while(p1<p2){
            if(arr[p1]!=arr[p2]){
                System.out.println("No");
                return;
            }
            p1++;
            p2--;
        }
        System.out.println("Yes");

    }
}