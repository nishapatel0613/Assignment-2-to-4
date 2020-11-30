import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int[] array=new int[10];

        int sum=0;

        for(int i=0;i<array.length;i++){

            System.out.println("Enter the "+(i+1)+" number:");

            array[i]=in.nextInt();

            sum+=array[i];

        }

        System.out.println("The sum is:"+ sum);

        //double average;
        double average = sum / array.length;
        System.out.println("The Average of those 10 values is:" + average);

    }
}
