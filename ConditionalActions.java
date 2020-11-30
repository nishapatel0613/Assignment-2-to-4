

public class ConditionalActions {
    public static void main(String[] args) {
        int n=0;
        if (n % 2 == 1){
            System.out.println("New");
        } else if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Old");
            } else if (n >= 6 && n <= 30) {
                System.out.println("Weird");
            } else if (n > 30) {
                System.out.println("Not Weird");
            }
        }
        }

}
