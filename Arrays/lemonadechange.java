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
        int c_5=0,c_10=0,c_20=0;
        for(int i=0;i<n;i++){
            if(arr[i]==5){
                c_5++;
            }
            else if(arr[i]==10){
                if(c_5>=1){
                    c_5--;
                    c_10++;
                }
                else{
                System.out.println("No");
                    return;
                }
            }
                else {
                    if(c_5>=1 && c_10>=1){
                        c_5--;
                        c_10--;
                        c_20++;
                    }
                    else if(c_5>=3){
                        c_5-=3;
                        c_20++;
                    }
                    else{
                    System.out.println("No");
                        return;
                    }
                }
        }
        System.out.println("Yes");
    }
}