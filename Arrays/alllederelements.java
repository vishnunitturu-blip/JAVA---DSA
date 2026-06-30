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
        int leader=arr[n-1];
        ArrayList<Integer>list=new ArrayList<>();
        list.add(leader);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>leader){
                leader=arr[i];
                list.add(leader);
            }
        }
        Collections.reverse(list);
        for(int i :list)
        {
            System.out.print(i+" ");
        }
    }
}