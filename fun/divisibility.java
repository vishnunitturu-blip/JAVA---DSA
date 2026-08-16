import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        if (n%3==0 && n%5==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
