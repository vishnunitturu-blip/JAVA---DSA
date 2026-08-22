import java.io.*;
import java.util.*;

class library {

    int id;
    String title;
    boolean avail;

    library(int id, String title, boolean avail) {
        this.id = id;
        this.title = title;
        this.avail = avail;
    }

    void issue() {
        if(avail == true) {
            avail = false;
            System.out.println("Available");
        }
        else {
            System.out.println("Book Not Available");
        }
    }

    void returnBook() {
        avail = true;
    }

    void status() {
        if(avail == true) {
            System.out.println("Available");
        }
        else {
            System.out.println("Not Available");
        }
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        int id = z.nextInt();
        String title = z.next();
        boolean avail = z.nextBoolean();
        String operation = z.next();

        library b = new library(id, title, avail);

        if(operation.equals("issue")) {
            b.issue();
        }
        else if(operation.equals("return")) {
            b.returnBook();
        }
        else if(operation.equals("status")) {
            b.status();
        }
    }
}