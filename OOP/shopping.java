import java.util.*;

class Calculate {

    String product;
    int price;
    int qut;

    Calculate(String product, int price, int qut) {
        this.product = product;
        this.price = price;
        this.qut = qut;
    }

    int total() {
        return price * qut;
    }

    int discount() {
        int total = total();

        if (total >= 1000) {
            total = total - (total * 10 / 100);
        }

        return total;
    }

    void display() {
        System.out.println(discount());
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        String product = z.next();
        int price = z.nextInt();
        int qut = z.nextInt();

        Calculate c = new Calculate(product, price, qut);

        System.out.println(c.total());
        System.out.println(c.discount());
        c.display();
    }
}
