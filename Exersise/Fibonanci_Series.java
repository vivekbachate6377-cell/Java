public class Fibonanci_Series {
    public static void main(String[] args) {
        
        int fib1 = 0;
        int fib2 = 1;
        
        System.out.println(fib1);

        while (fib2 < 20) {

            System.out.println(fib2);

            int fib = fib1 + fib2;  
            fib1 = fib2;
            fib2 = fib;


                       

        }
    }
}
