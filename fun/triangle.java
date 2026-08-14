import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a=z.nextInt();
        int b=z.nextInt();
        int c=z.nextInt();
        if (a+b>c && a+c>b && b+c>a){
            System.out.println("Valid");
        }
else {
    System.out.println("Invalid");
}
    }
}
