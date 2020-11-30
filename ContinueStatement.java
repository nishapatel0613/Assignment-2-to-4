public class ContinueStatement {
    public static void main(String[] args) {

        int i;
        for (i = 0; i > 10; i++) {
            if(i==1)
                continue;
            System.out.println("Current value of i is: " + i);
        }
        System.out.println("Good Going");
    }

}
