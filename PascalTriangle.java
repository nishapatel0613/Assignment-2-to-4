import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {

        int row;
        int c=1;
        int a;
        int i;
        int j;
        System.out.print("Input number of rows: ");
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        for(i=0;i<row;i++)
        {
            for(a=1;a<=row-i;a++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }
}
