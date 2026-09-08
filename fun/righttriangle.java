import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        int n=z.nextInt();
        for (int i=1; i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
