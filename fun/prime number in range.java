import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        int start = z.nextInt();
        int end = z.nextInt();

        for(int num = start; num <= end; num++) {

            if(num < 2) {
                continue;
            }

            boolean prime = true;

            for(int i = 2; i < num; i++) {

                if(num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if(prime) {
                System.out.print(num + " ");
            }
        }
    }
}
