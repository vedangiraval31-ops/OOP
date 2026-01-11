import java.util.Scanner;

class Practical6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, d1, d2, d3, d4, d5;
          int newNum;

        System.out.print("Enter a five digit number: ");
          num = sc.nextInt();
 
        d5 = num % 10;
          num = num / 10;

        d4 = num % 10;
          num = num / 10;

        d3 = num % 10;
          num = num / 10;

        d2 = num % 10;
          num = num / 10;

        d1 = num % 10;

        d1 = (d1 + 1) % 10;
        d2 = (d2 + 1) % 10;
        d3 = (d3 + 1) % 10;
        d4 = (d4 + 1) % 10;
        d5 = (d5 + 1) % 10;

           newNum = d1 * 10000 + d2 * 1000 + d3 * 100 + d4 * 10 + d5;

         System.out.println("New number: " + newNum);

        sc.close();
    }
}
