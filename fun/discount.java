import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int amt=z.nextInt();
        if (amt>=1000){
            int dis=(int)(amt*0.2);
        int fa=amt-dis;
            System.out.println(fa);
        }
         else if(amt>=500 && amt<=999){
            int dis=(int)(amt*0.1);
            int fa=amt-dis;
            System.out.println(fa);
        }
        else{
            System.out.println(amt);
        }
        
    }
}
