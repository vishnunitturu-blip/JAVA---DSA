import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int  n=z.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=z.nextInt();
            }
        }
        int forw=0;
        int back=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                    if(i==j){
                        forw=forw+arr[i][j];
                    }
                else if(i+j==n-1){
                    back=back+arr[i][j];
                }
            }
        }
        if(forw==back){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}