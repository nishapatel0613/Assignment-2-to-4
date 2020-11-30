import java.util.Scanner;

public class NumberDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of number:");
        int num = input.nextInt();
        if((num%3)==0 &&(num%5)==0) {
            System.out.println("Consultadd JAVA Training");
        }else if(num%3 == 0){
            System.out.println("Consultadd");
        }else if(num%5 == 0){
            System.out.println("JAVA Training");
        }


    }
}
