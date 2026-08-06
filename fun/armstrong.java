import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        int n = z.nextInt();

        int original = n;

        int temp = n;

        int count = 0;

        while(temp > 0){

            count++;

            temp = temp / 10;
        }

        temp = n;

        int sum = 0;

        while(temp > 0){

            int digit = temp % 10;

            sum = sum + (int)Math.pow(digit, count);

            temp = temp / 10;
        }

        if(sum == original){

            System.out.println("Yes");
        }
        else{

            System.out.println("No");
        }
    }
}
