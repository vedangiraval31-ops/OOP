import java.util.Scanner;

class Practical5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         int amount;
        int n100, n50, n10, n5, n2, n1;

        System.out.print("Enter amount: ");
        amount = sc.nextInt();

        n100 = amount / 100;
          amount = amount % 100;

        n50 = amount / 50;
          amount = amount % 50;

        n10 = amount / 10;
          amount = amount % 10;

        n5 = amount / 5;
          amount = amount % 5;

        n2 = amount / 2;
          amount = amount % 2;

        n1 = amount;

        System.out.println("100 = " + n100);
        System.out.println("50 = " + n50);
        System.out.println("10 = " + n10);
        System.out.println("5 = " + n5);
        System.out.println("2 = " + n2);
        System.out.println("1 = " + n1);

        sc.close();
    }
}
