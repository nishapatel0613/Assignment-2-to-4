import java.util.Scanner;

public class IncreasingDecreasingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        double x = input.nextDouble();
        System.out.print("Input second number: ");
        double y = input.nextDouble();
        System.out.print("Input third number: ");
        double z = input.nextDouble();
        if (x < y && y < z)
        {
            System.out.println("Increasing order");
        }
        else if (x > y && y > z)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
