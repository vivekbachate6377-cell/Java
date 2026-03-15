import java.util.*;

public class Function_Sum {

    public static int calculatSum(int a,int b){

        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculatSum(a, b);
        System.out.println("Sum of two Nmbers is:"+sum);

    }
}