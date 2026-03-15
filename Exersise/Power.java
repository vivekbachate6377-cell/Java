import java.util.Scanner;

public class Power {

    public static double power(int x, int n){

        double pow = Math.pow(x, n);

        return pow;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        double result = power(x, n);
        System.out.println(result);
    }
}
