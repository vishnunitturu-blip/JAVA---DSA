import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
Scanner z=new Scanner(System.in);
        int cp=z.nextInt();
        int sp=z.nextInt();
        if (sp>cp){
            int i=sp-cp;
    
             System.out.println("Profit "+i);
        }
        else if(sp<cp){
             int l=cp-sp;
        
            System.out.println("Loss "+l);
        }
        else{
System.out.println("No Profit No Loss");
        }
    }
}
