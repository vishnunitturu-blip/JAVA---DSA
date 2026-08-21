import java.io.*;
import java.util.*;
class employee {
    int empid;
    String name;
    employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }
}
class salary extends employee {
    int basicsalary;
    int experience;
    salary(int empid, String name, int basicsalary, int experience) {
        super(empid, name);
        this.basicsalary = basicsalary;
        this.experience = experience;
    }
    void display() {
        int bonus;
        if(experience >= 5) {
            bonus = 2000;
        }
        else {
            bonus = 1000;
        }
        int totalSalary = basicsalary + bonus;
        System.out.println(totalSalary);
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int empid = z.nextInt();
        String name = z.next();
        int basicsalary = z.nextInt();
        int experience = z.nextInt();
        salary s = new salary(empid, name, basicsalary, experience);
        String operation = z.next();
        if(operation.equals("display")) {
            s.display();
        }
    }
}
