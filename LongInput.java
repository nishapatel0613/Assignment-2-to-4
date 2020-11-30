import java.util.Scanner;

public class LongInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        long num= input.nextLong();
        System.out.println("Output value: "+(num * (num + 2)/ 2));
        input.close();
    }
}
