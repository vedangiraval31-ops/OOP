import java.util.Scanner;

interface Classify 
{
    String getDivision(double average);
}

class Result implements Classify 
{
    public String getDivision(double average) 
    {
        if (average >= 60) {
            return "First Division";
        } 
        else {
            return "No First Division";
        }
    }
}

class TestDivision
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter average: ");
        double avg = sc.nextDouble();

        Result r = new Result();
        System.out.println("Division = " + r.getDivision(avg));
    }
}