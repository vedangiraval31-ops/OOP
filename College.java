import java.util.Scanner;

class College {

    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }
    class Admission {

        String studentName;
        String course;

        Scanner sc = new Scanner(System.in);

        void acceptDetails() {
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }
        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); 
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {

        College c1 = new College("saffrony College");

        College.Admission a1 = c1.new Admission();

        a1.acceptDetails();
        a1.displayDetails();
    }
}