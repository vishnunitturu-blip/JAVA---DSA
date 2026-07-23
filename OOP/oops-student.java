import java.io.*;
import java.util.*;

class Student{
    int roll;
    String name;
    int marks;
    Student(int roll,String name,int marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println(roll+" "+name+" "+marks);
}
    void grade(){
        if(marks>=90){
System.out.println("A");
        }
        else if(marks>=75){
            System.out.println("B");
        }
        else if(marks>=50){
System.out.println("C");
        }
        else{
System.out.println("Fail");
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int roll=z.nextInt();
        String name=z.next();
        int marks=z.nextInt();
        Student std=new Student(roll,name,marks);
        int n=z.nextInt();
        for(int i=0;i<n;i++){
            String op=z.next();
            if(op.equals("display")){
                std.display();
            }
            else{
std.grade();
            }
}
        
    }
}