import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=z.nextInt();
            }
        }
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        if(even==n*n || odd==n*n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
