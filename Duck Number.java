import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        int n=z.nextInt();
        boolean duck=false;
        while(n>0){
            int digit=n%10;
            if(digit==0){
                duck=true;
                break;
            }
            n=n/10;
        }
            if(duck){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        }
