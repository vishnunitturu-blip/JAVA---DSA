import java.util.*;
public class solution{
    public static void main(String[]args){
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=z.nextInt();
        }
        Arrays.sort(arr);
        int l=0;
        int r=n-1;
        while(l<r){
            System.out.println(arr[r]+" "+arr[l]);
            l++;
            r--;
        }
        if(l==r){
        System.out.print(arr[l]+" "+0);
        }
    }
}
