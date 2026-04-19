import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class Result extends Student {
    int m1, m2, m3;

    Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void displayResult() {
        displayStudent();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("Marks 1: " + m1);
        System.out.println("Marks 2: " + m2);
        System.out.println("Marks 3: " + m3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

public class MarkSheet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No:");
        int roll = sc.nextInt();

        System.out.println("Enter Name:");
        String name = sc.next();

        System.out.println("Enter 3 subject marks:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        Result r = new Result(roll, name, m1, m2, m3);

        System.out.println("\n--- MARK SHEET ---");
        r.displayResult();

        sc.close();
    }
}