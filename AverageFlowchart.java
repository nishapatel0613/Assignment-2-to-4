public class AverageFlowchart {
    public static void main(String arg[])
    {
        int a = 10;
        int b = 20;
        int c = 30;
        int avg;
        avg= ( a + b + c)/ 3;
        System.out.println( avg);
 if ( a > b && a >c) {
     System.out.println("avg is higher than a,b and c");
    } else if (b>c){
     System.out.println("avg is higher than b and c");
 } else{
     System.out.println("avg is higher than a and b");
 }

    }

}
