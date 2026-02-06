import java.util.Scanner;

class Time {
    int hours;
    int minutes;

    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    void addTime(Time t1, Time t2) {
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours;

        if (minutes >= 60) {
            hours = hours + 1;
            minutes = minutes - 60;
        }
    }

    void displayTime() {
        System.out.println("Time: " + hours + " hours " + minutes + " minutes");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        System.out.print("Enter hours for first time: ");
        int h1 = sc.nextInt();
        System.out.print("Enter minutes for first time: ");
        int m1 = sc.nextInt();

        System.out.print("Enter hours for second time: ");
        int h2 = sc.nextInt();
        System.out.print("Enter minutes for second time: ");
        int m2 = sc.nextInt();

        t1.setTime(h1, m1);
        t2.setTime(h2, m2);

        t3.addTime(t1, t2);

        t3.displayTime();
    }
}
